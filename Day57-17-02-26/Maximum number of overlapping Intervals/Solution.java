
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        // int n = arr.length;
        // int max_count = 1;
        //  Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        // for(int i =0 ;i < n ; i++){
            
        //     int count =1;
        //     // int a= arr[i][0];
        //     int b= arr[i][1];
        //     for(int j =i+1 ;j < n ; j++){
        //         if(b>arr[j][0]){
        //           count++; 
        //         }
        //     }
            
        //     max_count= Math.max(count , max_count);
        // }
        // return max_count ;
        
        
        
        int n = arr.length;
        int[] start = new int[n];
        int [] end = new int[n];
        
        for(int i = 0 ; i< n ; i++){
            start[i]= arr[i][0];
            end[i]= arr[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0 , j =0 , current= 0 , ans= 0 ;
        
        while(i< n&& j< n){
            if(start[i]<= end[j]){
                current++;
                ans = Math.max(current, ans);
                i++;
            }else{
                current--;
                j++;
            }
        }
        
        return ans;
        
        
    }
}
