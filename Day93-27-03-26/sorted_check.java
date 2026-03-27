//Stack overflow error due to recursion 

class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        return checker(arr , 0);
    }
    
    boolean checker(int [] arr , int n){
        if(n>=arr.length-1) return true;
        if(arr[n]<=arr[n+1]){
            return checker(arr, n+1);
        }else{
            return false;
        }
    }
}

class Solution {
    public boolean isSorted(int[] arr) {
        return check(arr, 0);
    }

    private boolean check(int[] arr, int i) {
        if (i == arr.length - 1) return true;
        return arr[i] <= arr[i + 1] && check(arr, i + 1);
    }
}


// iterative version
class Solution {
    public boolean isSorted(int[] arr) {
        for(int i = 0 ; i< arr.length-1 ; i++){
            if(!(arr[i]<=arr[i+1])) return false;
        }
        return true;
    }

    
}
