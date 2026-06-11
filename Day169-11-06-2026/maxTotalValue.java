// question is

// find k subarray 
// for each sub array calculate the value = max - min
// add them and return the max possible value



// //brute force 

// Step 1: genrate all subarray 
// Step 2: store k max elements 
// step 3: return the sum of the k max element;
// // Implementation


class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                arr.add(max - min);
            }
        }

        Collections.sort(arr, Collections.reverseOrder());

        long total = 0;
        for (int i = 0; i < k; i++) {
            total += arr.get(i);
        }

        return total;
    }
}
