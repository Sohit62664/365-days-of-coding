class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int min_length = 0;
        int max_length = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int l = low;
        int h = high;
        // int digit = 0;
        while (l > 0) {
            // digit = l % 10;
            l /= 10;
            min_length++;
        }

        while (h > 0) {
            h /= 10;
            max_length++;
        }

        for (int i = min_length; i <= max_length; i++) {
            int digit = 1;
            while (digit <= 10 - i) {
                int num = 0;
                // int len = 0;
                for (int first = digit; first < digit + i; first++) {
                    num = num * 10 + first;
                }

                if (num >= low && num <= high)
                    ans.add(num);
                digit++;
            }

        }

        return ans;
    }
}
