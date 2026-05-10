class Solution {
	int thirdLargest(int arr[]) {
		// code here
		int first = -1 ;
		int second = -1 ;
		int third = -1 ;
		// in case duplicate are not allowed
		// 		for (int num :arr) {
		// 			if(num > first){
		// 			    third = second ;
		// 			    second = first;
		// 			    first = num;
		// 			}
		// 			if(num> second && num!= first){
		// 			    third = second;
		// 			    second = num;
		// 			}
		
		// 			if(num > third && num!= second  && num != first){
		// 			    third = num ;
		// 			}
		// 		}
		
		for (int num :arr) {
			if (num >= first) {
				third = second ;
				second = first;
				first = num;
			}else if((num>=second) && (num <=first)){
			    third= second;
			    second= num ;
			}else if((num >=third) && (num<= second)){
			    third = num;
			}
		}
		
		return third;
	}
}
