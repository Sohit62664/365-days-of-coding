class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        
        Integer[] result = new Integer[n];
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty()&& st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i]= -1 ;
            }else{
                result[i]= st.peek();
                
            }
            
            
            st.push(arr[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(result));
        
        return ans;
    }
}
