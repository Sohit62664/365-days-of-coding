class Solution {
    public int minBitFlips(int start, int goal) {
        int N = (start ^ goal) ;
        int cnt = 0 ; 

        while(N!= 0){
            N= (N & (N-1));
            cnt++;
        }


        return cnt;
        
    }
}
