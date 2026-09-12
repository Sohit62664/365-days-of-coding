class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        //case 1 
        int cols = isWhite(source); // colour of s& t
        int colt = isWhite(target);

        if(cols!=colt){
            return -1;
        }

        int sr0 = source[0];
        int sr1 = source[1];

        int t0 = target[0];
        int t1 = target[1];


        if(Math.abs(sr0 - t0 ) == Math.abs(sr1 - t1)){
            return 1 ; 
        }else{
            return 2 ;
        }
    }

    int isWhite(int [] src){
        int i = src[0];
        int j = src[1];
        if(i%2 == 0){
            if(j%2 == 0){
                return 0;
            }else{
                return 1;
            }
        }else{
            if(j%2== 0){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
