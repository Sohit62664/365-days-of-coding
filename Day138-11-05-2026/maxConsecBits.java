
class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        // maximum Consecutive 0 or 1 
        
        int max_z= 0;
        int max_1= 0;
        
        int i=0; 
        int l0 = 0 ;
        int l1 = 0 ;
        while(i<arr.length){
            int a = arr[i];
            if(a==0){
                l0++;
                max_z= Math.max(l0 , max_z);
                l1=0;
            }
            
            if(a==1){
                l1++;
                max_1 = Math.max(l1, max_1);
                l0= 0;
            }
          
            i++;
        }
        return Math.max(max_z,max_1);
    }
}




// ap2

class Solution {
	public int maxConsecBits(int[] arr) {
		// code here
		
		int max = 0 ;
		int count = 1 ;
		for (int i = 1 ; i<arr.length ; i++) {
			if (arr[i] != arr[i - 1]) {
				max = Math.max(max, count);
				count = 1 ;
			} else {
				count++;
				
			}
		}
		// update the last count very-very Important
		
		max = Math.max(max, count);
		
		return max ;
	}
}

