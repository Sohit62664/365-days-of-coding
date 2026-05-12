class Solution {
	void rearrange(ArrayList<Integer> arr) {
		// code here
		ArrayList<Integer> positive = new ArrayList<>();
		ArrayList<Integer> negative = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int num : arr) {
			if (num >= 0) {
				positive.add(num);
			} else {
				negative.add(num);
			}
		}
		
		int i = 0 ;
		int j = 0 ;
		
		while (i<positive.size() && j < negative.size()) {
			ans.add(positive.get(i));
			ans.add(negative.get(j));
			i++;
			j++;
		}
		
		while (i<positive.size()) {
			ans.add(positive.get(i));
			i++;
		}
		while (j<negative.size()) {
			ans.add(negative.get(j));
			j++;
		}
		
		for (int k = 0; k < arr.size(); k++) {
			arr.set(k, ans.get(k));
		}
	}
}
