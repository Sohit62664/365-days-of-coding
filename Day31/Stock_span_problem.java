package Day31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Stock_span_problem {

    public static void main(String[] args) {
        int[] nums = { 10, 4, 5, 90, 120, 80 };
        ArrayList<Integer> ans = calculateSpan2(nums);
        System.out.println(ans.toString());
    }

    // Brout force approach
    public static ArrayList<Integer> calculateSpan1(int[] arr) {

        // ArrayList<Integer> ans = new ArrayList<>();

        // int count =0 ;
        // int pre = 0;

        // for(int i = 0 ; i< arr.length ; i++){
        // int current = arr[i];
        // if(current>pre){
        // count++;
        // pre = current;
        // }else{
        // pre = current;
        // count = 1;
        // }
        // ans.add(count);
        // }
        // return ans;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = count_left(arr, i);
            ans.add(count);
        }
        return ans;

    }

    private static int count_left(int[] arr, int i) {
        int current = arr[i];
        int count = 0;
        for (int j = i; j >= 0; j--) {
            if (arr[j] <= current) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }

    // Optimize code

    public static ArrayList<Integer> calculateSpan2(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // pop smaller or equal elements
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // span = (i - index of previous greater)
            if (st.isEmpty()) {
                ans.add(i + 1);
            } else {
                ans.add(i - st.peek());
            }

            st.push(i);
        }
        return ans;
    }
}
