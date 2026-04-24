class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0 ;
        int r = 0 ;
        int s = 0 ;
        for(int  i = 0 ; i< moves.length() ;i++){
            char ch = moves.charAt(i);
            if(ch== 'R'){
                r++;
            }else if(ch == 'L'){
                l++;
            }else{
                s++;
            }
        }
        int maxl = l+s - r;
        int maxr = r+s-l;
        return Math.max(maxl, maxr);
    }
}