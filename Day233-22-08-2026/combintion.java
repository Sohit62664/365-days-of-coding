class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
       List<Integer> list = new ArrayList<>();
       recurse(n , 0 ,k  , list);

       return ans;
    }

    void recurse(int n , int i , int k , List<Integer> list){
        if(list.size()== k){
            ans.add(new ArrayList<>(list));
            return ;
        }

        if(i == n){
            return ;
        }
        list.add(i+1);
        recurse(n , i+1 , k , list);
        list.remove(list.size()-1);
        recurse(n , i+1 , k , list);
    }
}
