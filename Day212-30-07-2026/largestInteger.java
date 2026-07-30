class Solution {
    public int largestInteger(int n, int s) {
        // n digit with largest sum 
        // given Sum of Digits 
        // for all n if s > 9  *n then return -1 

        //base case 
        if (s > n * 9) {
            return -1; //not possible such n digit number 
        }

        // make a string of n digits initialize all with 9
        int num = 0;

        while (s >= 9 || n > 0) {
            if (s >= 9) {
                num = num * 10 + 9;
                s -= 9;
            } else if (s < 9 && s > 0) {
                num = num * 10 + s;
                s = 0;

            } else if (s == 0) {
                num = num * 10;
            }
            n--;

        }

        return num;
    }
}
