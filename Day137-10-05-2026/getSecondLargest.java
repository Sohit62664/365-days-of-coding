// in Single pass 
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // m1  sort and get 
        int max = Integer.MIN_VALUE;
        int second = -1;
        
        for(int i=0 ; i< arr.length ; i++){
            if(max<arr[i]){
                int temp = max;
                max= arr[i];
                if(temp != max)
                second = temp;
            }
            
            if(arr[i]!= second && arr[i]>second && arr[i]<max){
                second = arr[i];
            }
        }
        if(second== Integer.MIN_VALUE){
            return -1;
        }else{
            return second;
        }
    }
}

// optimized above code single pass
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first =-1 ;
        int second =-1 ;
        
        for(int num : arr){
            if(num >first){
                second = first;
                first = num;
                
            }else if(num >second && num != first){
                second = num ;
            }
        }
        return second;
    }
}




// in two pass approach 

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // m1  sort and get 
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int m : arr){
            max= Math.max(m , max);
        }

        for(int m:arr){
            if(m!= max){
                second = Math.max(second , m);
            }
        }

        if(second == Integer.MIN_VALUE){
            return -1;
        }
        else {
            return second;
        }
        
    }
}


// Anorther Method is 
// sort the array and get n-1 element

