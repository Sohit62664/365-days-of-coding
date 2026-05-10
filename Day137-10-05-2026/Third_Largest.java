// Single pass
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




// in three passes when duplicate are allowed 

class Solution {
    int thirdLargest(int arr[]) {
        // code here
        // i n thre pass
        int first = -1;
        int second = -1;
        int third = -1;
        int fi= -1;
        for(int i=0 ; i< arr.length ; i++){
            if(first<arr[i]){
                first = arr[i];
                fi= i;
            }
        }
        
        if(fi!=-1){
            arr[fi]= -1;
            fi= -1;
        }
        for(int i=0 ; i< arr.length ; i++){
            if(second<arr[i]){
                second = arr[i];
                fi= i;
            }
        }
        
        if(fi!=-1){
            arr[fi]= -1;
            fi= -1;
        }
        for(int i=0 ; i< arr.length ; i++){
            if(third<arr[i]){
                third = arr[i];
            }
        }
        
                
        return third;
    }
}
