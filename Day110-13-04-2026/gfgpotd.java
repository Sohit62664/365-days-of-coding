class Solution {
    static int[] nextPalindrome(int[] num) {
        int n = num.length;
        int[] ans = num.clone();

        // STEP 1: Mirror left → right
        for (int i = 0; i < n / 2; i++) {
            ans[n - 1 - i] = ans[i];
        }

        // STEP 2: Check if ans > num
        boolean greater = false;
        for (int i = 0; i < n; i++) {
            if (ans[i] > num[i]) {
                greater = true;
                break;
            } else if (ans[i] < num[i]) {
                break;
            }
        }

        if (greater) return ans;

        // STEP 3: Handle carry from middle
        int carry = 1;
        int mid = n / 2;

        if (n % 2 == 1) {
            ans[mid] += carry;
            carry = ans[mid] / 10;
            ans[mid] %= 10;
            mid--;
        } else {
            mid = n / 2 - 1;
        }

        // propagate carry
        while (mid >= 0 && carry > 0) {
            ans[mid] += carry;
            carry = ans[mid] / 10;
            ans[mid] %= 10;
            mid--;
        }

        // STEP 4: Mirror again
        for (int i = 0; i < n / 2; i++) {
            ans[n - 1 - i] = ans[i];
        }

        // STEP 5: Special case (999 → 1001)
        if (carry > 0) {
            int[] res = new int[n + 1];
            res[0] = 1;
            res[n] = 1;
            return res;
        }

        return ans;
    }
}




// class Solution {
//     static int[] nextPalindrome(int[] num) {
//         // code here
//         int n = num.length;
//         int[] ans = new int[n];
//         if (n % 2 == 0) {
//             int k = 0;
//             for (int i = 0; i < n / 2; i++) {
//                 ans[i] = num[i];
//                 k++;
//             }

//             for (int j = k - 1; j >= 0; j--) {
//                 ans[k] = num[j];
//                 k++;
//             }

//             if (num[n / 2] < ans[n / 2]) {
//                 return ans;
//             }

//             ans[(n / 2) - 1] += 1;
//             ans[(n / 2)] += 1;

//             return ans;
//         } else {
//             int k = 0;
//             for (int i = 0; i < n / 2; i++) {
//                 ans[i] = num[i];
//                 k++;
//             }
//             int m = k;
//             ans[k] = num[k];
//             k++;

//             for (int j = k - 2; j >= 0; j--) {
//                 ans[k] = num[j];
//                 k++;
//             }

//             if (num[(n / 2) + 2] < ans[(n / 2) + 2]) {
//                 return ans;
//             }
//             int t = n / 2;
//             if (ans[t + 1] == 9) {
//                 ans[t] = 0;
//                 while (t > 0 && ans[t] == 9) {
//                     ans[t] = 0;
//                     t--;
//                 }
//                 if (ans[t] != 9) {
//                     ans[t]++;
//                     //copy in reverce order
//                     k= m;
//                     for (int j = k - 2; j >= 0; j--) {
//                 ans[k] = num[j];
//                 k++;
//             }
//                     return ans;
//                 }
//             }

//             // if(){
//             // ans[(n/2)]=0 ;
//             // ans[(n/2)-1]++;
//             // ans[(n/2)+1]++;
//             // return ans;
//             // }

//             ans[(n / 2)] += 1;
//             // ans[(n/2)]+=1;

//             return ans;
//         }
//     }

// }
