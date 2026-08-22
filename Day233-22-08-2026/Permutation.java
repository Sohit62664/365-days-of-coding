import java.util.ArrayList;
import java.util.Arrays;

public class permutation {

    static void permute(int nums[], int i) {
        if (i == nums.length) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            permute(nums, i + 1);
            // backtrack
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    static ArrayList<String> list = new ArrayList<>();

    static void permute(String str, String ans) {
        if (0 == str.length()) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        permute(nums, 0);

        permute("ABC", "");

        System.out.println(list);
    }
}
