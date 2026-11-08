class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        int a = -1 ; 
        int b = -1 ;
        
        int low  = 0 ;
        int high = arr.length-1 ; 
        
        
        // first occurance find
        a = binsearch(low , high , true , x , arr);
        b = binsearch(low , high , false , x , arr);
        
        
        
        ans.add(a);
        ans.add(b);
        return ans;
    }
    
    int binsearch(int low , int high , boolean first , int target , int [] arr){
        int a = -1 ;
        int b = -1;
        
        int st = low ; 
        int end = high ;
        
        while(low<= high){
            int mid = low + (high - low)/ 2; 
            
            if(arr[mid] == target){
                a = mid;
                high = mid-1;
            }else if(arr[mid] > target){
                high = mid -1;
            }else{
                low = mid+1; 
            }
        }
        
        
        while(st<= end){
            int mid = st+ (end -st )/ 2;
            
            if(arr[mid]== target){
                b= mid ; 
                st = mid+1;
            }else if(arr[mid] < target){
                st = mid+1 ;
            }else{
                end = mid -1 ; 
            }
        }
        
        if(first){
            return a ;
        }else{
            return b ;
        }
        
    }
}
