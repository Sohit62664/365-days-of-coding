class Solution {
    public int maxProduct(int n) {
        //findout max wo digits and retur their producr 
        int first = 0;
        int second = 0;

        while(n> 0 ){
            int rem = n%10 ;
            if(first <= rem){
                second = first;
                first = rem ;
            }else if(rem >= second && rem <= first){
                second = rem ; 
            }
            n/=10;
        }

        return first * second ;
    }
}
