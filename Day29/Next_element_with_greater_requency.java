package Day29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class Next_element_with_greater_requency
 {
    // class Solution {
//     public ArrayList<Integer> nextFreqGreater(int[] arr) {
//         // code here
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i = 0 ; i< arr.length ; i++){
//             map.put(arr[i], map.getOrDefault(arr[i],0)+1 );
//         }
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i =0 ; i< arr.length ; i++){
//             // boolean flag= false;
//             int copy_j = -1;
//             int i_freq= map.get(arr[i]);
//             for(int j = i+1 ; j< arr.length ; j++){
//                 if(i_freq<map.get(arr[j])){
//                     copy_j = arr[j];
//                     break;
//                 }
//             }
//             ans.add(copy_j);
            
//         }
//         return ans;
//     }
// }


class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) freq.put(x, freq.getOrDefault(x, 0) + 1);

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int f = freq.get(arr[i]);

            while (!st.isEmpty() && freq.get(arr[st.peek()]) <= f) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ans.set(i, arr[st.peek()]);
            }

            st.push(i);
        }
        return ans;
    }
}

}
