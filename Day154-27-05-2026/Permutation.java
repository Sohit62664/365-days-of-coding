class Solution {
    ArrayList<List<Integer>> ans  = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        helper(nums , 0 );
        return ans ;

    }

    void helper(int [] nums , int i){
        if(i == nums.length){
        ArrayList<Integer> list =  new ArrayList<>();
            for(int c: nums){
                list.add(c);
            }
            ans.add(list);
            return;
        }


        for(int j  = i ; j< nums .length ; j++){
            swap(nums , i , j);

            helper(nums , i+1);

            swap(nums , i , j);
        }        
    }

    void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


// using next permutation 



class Solution {

    ArrayList<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        Arrays.sort(nums);

        int total = factorial(nums.length);

        for (int k = 0; k < total; k++) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int num : nums) {
                list.add(num);
            }

            ans.add(new ArrayList<>(list));

            next(nums);
        }

        return ans;
    }

    void next(int[] nums) {

        int pivot = breakpoint(nums);
        int n = nums.length;

        // if breakpoint exists
        if (pivot != -1) {

            int next = n - 1;

            for (int i = n - 1; i > pivot; i--) {

                if (nums[i] > nums[pivot]) {
                    next = i;
                    break;
                }
            }

            swap(nums, pivot, next);
        }

        // reverse right side
        reverse(nums, pivot + 1, n - 1);
    }

    int breakpoint(int[] nums) {

        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        return i;
    }

    void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int i, int j) {

        while (i < j) {

            swap(nums, i, j);
            i++;
            j--;
        }
    }

    int factorial(int n) {

        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
