class Solution {
	public int findXOR(int l, int r) {
		// code here
		int lxor = xorr(l-1);
		int rxor = xorr(r);
		
	
		
		return lxor^rxor ;
		
	}
	int xorr(int N) {
		if (N%4 == 0)
			return N ;
		else if (N%4 == 1)
			return 1;
		else if (N%4 == 2)
			return N + 1;
		else
			return 0;
		
	}
}
