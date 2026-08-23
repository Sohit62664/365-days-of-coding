class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length ;
        Integer result [] = new Integer[n];
        
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ; i>= 0 ; i--){
            
            int num = arr[i];
            
            while(!st.isEmpty() && num >= arr[st.peek()]){
                st.pop();
                
            }
            
            result[i] = st.isEmpty() ?  -1 : arr[st.peek()];
            
            st.push(i);
            
        }
        
        
        ArrayList<Integer> ans  =new ArrayList<>(Arrays.asList(result));
        
        return ans;
    }
}
