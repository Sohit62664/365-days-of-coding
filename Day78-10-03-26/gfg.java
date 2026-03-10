// class Solution {
//     public int countSubarrays(int[] arr) {
//         // code here
//         int n = arr.length;
//         int count = 0;
//         for (int i =0 ; i< n ; i++){
//             for(int j = i ; j< n ; j++){
//                 if(arr[j]<arr[i]){
//                     // the first element a[i] is no longer minimum
//                     break;
//                 }
//                 count++;// new valid subarray
//             }
//         }
        
//         return count;
//     }
// }


class Solution {
    public int countSubarrays(int[] arr) {

        int n = arr.length;
        long count = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                int index = stack.pop();
                count += i - index;
            }

            stack.push(i);
        }

        
        while(!stack.isEmpty()){
            int index = stack.pop();
            count += n - index;
        }

        return (int)count;
    }
}
