// buble sort
import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] a = {1,22,4,54,5 ,-1};
        buble_sort(a);
        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(a));
    }
    
    static void buble_sort(int [] a){
        int n = a.length;
        for(int i = 0 ; i< n ; i++){
            for( int j = 0 ; j< n-i-1 ; j++){
                if(a[j]>a[j+1]){
                    // swap(a , j , j+1);
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
}




// Selection Sort
import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] a = {1,22,4,54,5 ,-1};
        selection_sort(a);
        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(a));
    }
    
    static void selection_sort(int [] a){
        int n = a.length;
        for(int i = 0 ; i< n ; i++){
            int min= a[i];
            int k = i;
            for( int j = i+1 ; j< n ; j++){
                if(a[j]<min){
                    min= a[j];
                    k = j;
                }
            }
            
            // swap(a, a[i], min)
            int temp = a[i] ;
            a[i]= a[k];
            a[k]= temp;
            
        }
    }
}




// insertion Sort 
import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] a = {1,22,4,54,5 ,-1};
        insertion_sort(a);
        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(a));
    }
    
    static void insertion_sort(int [] a){
        int n = a.length;
        for(int i = 1 ; i< n ; i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key ){
                //shifting by 1 
                a[j+1]= a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
}
