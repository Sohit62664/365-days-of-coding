class Solution {
	public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
		// code here
		// Step1 Calculte the height of the tree
		int n = arr.length;
		double result = Math.log(n + 1) / Math.log(2);
		int levels = (int) Math.ceil(result); // Rounds up
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		int index = 0 ;
        //Step 2 : store the level in a list and sort it 
		for (int i = 0 ; i < levels ; i++) {
			int level_size = (int) Math.pow(2, i);
			ArrayList<Integer> list = new ArrayList<>();
			
			for (int j = 0 ; j<level_size && index < n ; j++) {
				list.add(arr[index]);
				index++;
			}
			
			Collections.sort(list);
			
			ans.add(list);
		}
		
		return ans ;
		
	}
}
