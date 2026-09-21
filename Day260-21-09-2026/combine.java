class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list  = new ArrayList<>();
        comb( n ,  k , 1 ,  list );
        return ans;
    }

    void comb(int n , int k , int st , List<Integer> list){
        if(list.size() == k ){
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int i = st ; i<= n ; i++){
            list.add(i);
            comb(n , k , i+1 , list);
            list.remove(list.size()-1);
        }
    }


}
