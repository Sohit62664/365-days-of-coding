class Solution {

     void mergesort(int arr[], int l, int r) {
        // code here
        mergesort(arr , 0 , arr.length-1);
    }
    
    static void mergeSort(int [] arr , int l , int r ){
        if(l< r){
            int m = l + (r-l)/2;
            
            mergeSort(arr , l , m);
            mergeSort(arr , m+1 , r);
            
            
            merge(arr , l , m , r);
        }
    }
    
    static void merge(int [] arr , int l , int m , int r ){
        
        int n1 = m-l+1;
        int n2 = r-m;
        
        int [] L = new int [n1];
        int [] R = new int [n2];
        
        
        for(int i = 0 ; i<n1 ; i++){
            L[i]= arr[i+l];
        }
        
        for(int j = 0 ; j< n2 ; j++){
            R[j]= arr[m+j+1];
        }
        
        
        
        int i = 0 ;
        int j = 0 ; 
        int k = l;
        
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]= L[i];
                i++;
            }else{
                arr[k]= R[j];
                j++;
            }
            k++;
            
        }
        
        
        while(i< n1){
            arr[k]=L[i];
            k++;
            i++;
        }
        
        
        while (j < n2 ){
            arr[k]= R[j];
            j++;
            k++;
        }
    }
}
