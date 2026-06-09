class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {

        int count = 0;
        int n = seats.length;
        
        for(int i =1 ; i < n ; i++){
            if(seats[i-1] == 1 && seats[i]== 1){
                return false;
            }
        }

        for (int i = 0; i < n; i++) {

            if (seats[i] == 1) {
                continue;
            }

            if (i == 0) {
                if ((n == 1) || seats[i + 1] == 0) {
                    count++;
                    i++;
                }
            }
            else if (i == n - 1) {
                if (seats[i - 1] == 0) {
                    count++;
                }
            }
            else {
                if (seats[i - 1] == 0 && seats[i + 1] == 0) {
                    count++;
                    i++;
                }
            }
        }

        return count >= k;
    }
}






// clean approach   


class Solution {
	public boolean canSeatAllPeople(int k, int[] seats) {
		// code here
		// by array preprocessing
		
		int n = seats.length;
		
		// if(k == 0) return false;
		
		for (int i = 0; i < seats.length - 1; i++) {
			if (seats[i] == 1 && seats[i + 1] == 1) {
				return false;
			}
		}
		
		int count = 0 ;
		
		for (int i = 0 ; i < n ; i++) {
			if (seats[i] == 0) {
				boolean left = (i == 0 || seats[i - 1] == 0);
				boolean right = (i == n - 1 || seats[i + 1] == 0);
				
				if (left && right) {
					count++;
					seats[i] = 1;
				}
			}
		}
		
		return count >= k ;
		
	}
}
