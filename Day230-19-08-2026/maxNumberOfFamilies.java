// Naive approach
class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        boolean[][] reserve = new boolean[n][10];

        for (int i = 0; i < n; i++) {
            Arrays.fill(reserve[i], true);
        }

        for (int[] seat : reservedSeats) {
            int a = seat[0];
            int b = seat[1];

            reserve[a-1][b-1] = false;
        }

        int total = 0 ;
        for(int i = 0 ; i< n ; i++){
            int count = 0 ;

            if(reserve[i][1] && reserve[i][2] && reserve[i][3] && reserve[i][4]){
                count++;
                reserve[i][3] = false ;
                reserve[i][4] = false;
            }


            if(reserve[i][5] && reserve[i][6] && reserve[i][3] && reserve[i][4]){
                count++;
                reserve[i][5] = false ;
                reserve[i][6] = false;
            }


            if(reserve[i][5] && reserve[i][6] && reserve[i][7] && reserve[i][8]){
                count++;
            }
            total+= count;

        }

        return total;
    }
}
