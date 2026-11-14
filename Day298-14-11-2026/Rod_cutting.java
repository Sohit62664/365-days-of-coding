class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        return f(n-1 ,0, price);
    }
    
    int f(int i ,int l , int[] price){
        if(i< 0){
            return 0;
        }
        
        int notcut = f(i-1 ,l+1 , price);
        
        int cut = price[l] + f(i-1 , 0 , price);
        
        return Math.max(notcut , cut);
    }
}
