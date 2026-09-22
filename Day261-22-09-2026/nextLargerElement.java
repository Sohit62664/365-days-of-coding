class Solution {
	public ArrayList<Integer> nextLargerElement(int[] arr) {
		// code here
		int n = arr.length;
// 		int [] result = new int[n];
        ArrayList<Integer> list = new ArrayList<>(); 
		
		Stack<Integer> st = new Stack<>();
		
		for (int i = n-1 ; i>= 0 ; i--){
		    while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
		        st.pop();
		    }
		    
		    int v = st.isEmpty() ? -1 : arr[st.peek()];
		    list.add(v);
		    
		    st.push(i);
		}
		
		Collections.reverse(list);
		
		return list;
		 
	}
}
