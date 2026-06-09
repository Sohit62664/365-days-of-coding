class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {

        int count = 0;
        int n = seats.length;

        for (int i = 0; i < n; i++) {

            if (seats[i] == 1) {
                continue;
            }

            if (i == 0) {
                if ((n == 1) || seats[i + 1] == 0) {
                    count++;
                    i++;
                }
            }
            else if (i == n - 1) {
                if (seats[i - 1] == 0) {
                    count++;
                }
            }
            else {
                if (seats[i - 1] == 0 && seats[i + 1] == 0) {
                    count++;
                    i++;
                }
            }
        }

        return count >= k;
    }
}
