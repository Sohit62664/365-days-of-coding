public class Arranging_coin {
    class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int count=0;
        while(n>=0){
            n-=i;
            if(n>=0){
                count++;
            }else{
                break;
            }
            i++;
        }
        return count;
    }
}
}
