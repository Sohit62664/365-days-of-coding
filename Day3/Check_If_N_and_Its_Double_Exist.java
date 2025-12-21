package Day3;

import java.util.HashSet;

public class Check_If_N_and_Its_Double_Exist {
    class Solution {
    public boolean checkIfExist(int[] arr) {

        // method 01
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (i != j && arr[i] == 2 * arr[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //method 02
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for (int a : arr) {
            set.add(a);
            if(a==0) count++;
        }
        if(count>=2) return true;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] !=0 && set.contains(arr[i] * 2)) {
                return true;
            }
        }
        return false;
    }
}


}
