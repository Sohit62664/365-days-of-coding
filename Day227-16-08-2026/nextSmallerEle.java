class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n = arr.length;
        
        int ans [] = new int[n] ;
        
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = n-1 ; i >= 0 ; i--){
            
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                ans[i]= -1 ;
                
            }else{
                ans[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : ans){
            list.add(num);
        }
        
        return list ;
    }
}
