class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //Using Recursion 

        return f(0 , 0 , triangle);
    }

    int f(int i , int j , List<List<Integer>> a){
        if(i == a.size() -1) return a.get(a.size() -1).get(j);


        int down = f(i+1 , j , a) ;
        int digo = f(i+1 , j+1 , a);

        return a.get(i).get(j) + Math.min(down , digo);
    }
}
