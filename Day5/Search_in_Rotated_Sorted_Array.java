package Day5;

public class Search_in_Rotated_Sorted_Array {
    
class Solution1 {
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //left sorted
            if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                //right Sorted
                if (nums[mid] < target && nums[end] >= target) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

}

//Second method By Finding pivot 
class Solution2 {
    public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        // int st = 0;
        // int end = pivot;

        // pivot not found case
        if (pivot == -1) {
            return bin_search(nums, 0, nums.length - 1, target);
        }
        // if the pivot is findout then their is three caces 
        if(nums[pivot]== target){
            return pivot;
        }
        if (target >= nums[0]) {
            return bin_search(nums, 0, pivot - 1, target);
        }

        return bin_search(nums, pivot + 1, nums.length - 1, target);

        // while (st <= end) {
        //     int mid = st + (end - st) / 2;
        //     if (nums[mid] == target) {
        //         return mid;
        //     } else if (nums[mid] > target) {
        //         end = mid - 1;
        //     } else {
        //         st = mid + 1;
        //     }
        // }

        // st = findpivot(nums);
        // end = nums.length - 1;
        // while (st <= end) {
        //     int mid = st + (end - st) / 2;
        //     if (nums[mid] == target) {
        //         return mid;
        //     } else if (nums[mid] > target) {
        //         end = mid - 1;
        //     } else {
        //         st = mid + 1;
        //     }
        // }
        // return -1;
    }

    static int bin_search(int[] nums, int st, int end, int target) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    static int findpivot(int[] nums) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > st && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[st] >= nums[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }
}

}
