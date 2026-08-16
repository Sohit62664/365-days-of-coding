// class Solution {
//     public ArrayList<Integer> nextLargerElement(int[] arr) {
//         // code here
//         int max = arr[0];
        
//         HashSet<Integer> set = new HashSet<>();
        
//         for(int num  : arr){
//             set.add(num);
//             max = Math.max(max , num);
//         }
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         for(int i = 0 ; i < arr.length-1 ; i++){
//             boolean flag = false ;
//             for(int j = arr[i]+1 ; j<= max ; j++){
//                 if(set.contains(j)){
//                     ans.add(j);
//                     flag = true ;
//                     break;
//                 }
//             }
//             if(!flag){
//                 ans.add(-1);
//             }
            
            
//         }
//         ans.add(-1);
        
//         return ans ;
        
        
//     }
// }


class Solution {
     public ArrayList<Integer> nextLargerElement(int[] nums) {
        Stack<Integer> st = new Stack<>();

        int n = nums.length;
        int ans [] = new int[n];
        
        for(int i = n-1 ; i>= 0 ; i--){

            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]= -1 ;
            }else{
                ans[i] = st.peek();
            }

            st.push(nums[i]);
        }
        
        
        ArrayList<Integer > list = new ArrayList<>();
        
        for(int i =0 ; i< n ; i++){
            list.add(ans[i]);
        }
        
        return list ;
    }
}



// Algorithm

// For each arr[i]:

// Remove all elements from the stack that are <= arr[i].
// They can never be the answer for arr[i].
// If stack is empty → answer is -1.
// Otherwise → stack.peek() is the next greater element.
// Push arr[i] into the stack.
