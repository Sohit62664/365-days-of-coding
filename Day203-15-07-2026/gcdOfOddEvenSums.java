class Solution {
    public int gcdOfOddEvenSums(int n) {
        //first n odd numbers = n^2 
        //first n even numbers = n * (n+1)
        
        int even = n * (n+1);
        int odd = n * n ;

        return gcd(odd , even);

    }

    int gcd(int a , int b){
        if(b==0){
            return a ;
        }

        return gcd(b , a % b);
    }
}
