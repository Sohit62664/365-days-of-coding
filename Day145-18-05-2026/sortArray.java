class Solution {
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
        // Code here
        int n = arr.length;
        int i = (A>=0) ? n-1: 0 ;
        int [] ans = new int[n];
        
        
        int l = 0 ;
        int r = n-1;
        
        ArrayList <Integer> result = new ArrayList<>();
        
        while(l <= r){
            int l_v = function(arr[l] , A, B,C);
            int r_v = function(arr[r] , A, B,C);
            if(A>=0){
                if(l_v > r_v){
                    ans[i--]= l_v;
                    l++;
                }else{
                    ans[i--]= r_v;
                    r--;
                }
            }else{
                if(l_v < r_v){
                    ans[i++]= l_v;
                    l++;
                }else{
                    ans[i++]= r_v;
                    r--;
                }
            }
        }
        
        for(int a: ans){
            result.add(a);
        }
        
        
        return result;
        
    }
    
    int function(int x , int A , int B , int C){
        return A*(x*x)+ B*x +C;
    }
}
