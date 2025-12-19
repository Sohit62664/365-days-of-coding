package Day1;

class Solution {
    public int mySqrt(int x) {
        // by the Substraction method 
        int j = 1;
        int count = 0;
        while (x >= j) {
            x -= j;
            count++;
            j += 2;
        }
        return count;

    }
}
