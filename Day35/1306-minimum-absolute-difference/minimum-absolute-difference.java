// class Solution {
//     public List<List<Integer>> minimumAbsDifference(int[] arr) {


//         //O(n^3) Solution
//         List<List<Integer>> ans = new ArrayList<>();
//         int n = arr.length;

//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < n; i++) {
//             int a = arr[i];
//             for (int j = 0; j < n; j++) {
//                 int b = arr[j];
//                 if (b != a) {
//                     int diff = Math.abs(b - a);
//                     min = Math.min(min, diff);
//                 }
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             int a = arr[i];
//             for (int j = 0; j < n; j++) {
//                 int b = arr[j];
//                 int diff = Math.abs(b - a);
//                 if (diff == min && b != a) {
//                     if (a > b) {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(b);
//                         temp.add(a);
//                         if (!ans.contains(temp)) {
//                             ans.add(temp);
//                         }
//                     } else {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(a);
//                         temp.add(b);
//                         if (!ans.contains(temp)) {
//                             ans.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
    

//         Collections.sort(ans, (a,b)-> Integer.compare(a.get(1), b.get(1)));
//         return ans;
//     }
// }


class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int min = Integer.MAX_VALUE;

        
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }

        List<List<Integer>> ans = new ArrayList<>();

        
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] == min) {
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return ans;
    }
}
