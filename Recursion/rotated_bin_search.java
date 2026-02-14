package Recursion;



public class rotated_bin_search {
    public static void main(String[] args) {
        int [] num = {4,5,6,7,0,1,2};
        int pivot = pivotfinder(num, 0, num.length-1);
        if(pivot!=-1){
            int left = (bin_search(num, 0, 0 , pivot ));
            if(left == -1) {
                System.out.println(bin_search(num, 0, pivot  , num.length-1 ));
            }else{
                System.out.println(left);
            }
        }
    }


    public static int bin_search(int[] num, int target, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if (num[mid] == target)
                return mid;
            else if (num[mid] > target)
                return bin_search(num, target, st, mid - 1);
            else
                return bin_search(num, target, mid + 1, end);
        }
        else{
            return -1;
        }
    }


    

    




    static int pivotfinder(int[] num, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid < end && num[mid] > num[mid + 1])
                return mid;
            else if (mid>st && num[mid] < num[mid - 1])
                return mid - 1;
            else if (num[mid] < num[st])
                return pivotfinder(num, st, mid - 1);
            else
                return pivotfinder(num, mid + 1, end);
        }else{
            return -1;
        }
    }
}
