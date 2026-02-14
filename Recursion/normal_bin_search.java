package Recursion;

public class normal_bin_search {
    public static void main(String[] args) {
        int[] num = { 1, 4, 7, 9, 45, 65, 76, 98 };
        System.out.println(bin_search(num, 9, 0, num.length));
    }

    public static int bin_search(int[] num, int target, int st, int end) {
        if (st < end) {
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
}
