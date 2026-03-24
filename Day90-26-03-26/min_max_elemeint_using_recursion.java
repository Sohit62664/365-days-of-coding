// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[] arr = {-11, 4, 3, -5, -4, 8, 6};
        min_max(arr, 0 , 0 , arr.length-1);
    }
    static void min_max(int [] arr , int min , int max , int len){
        if(len < 0 ){
            System.out.println(arr[min]);
            System.out.println(arr[max]);
            return;
            
        }
        
        if(arr[min]>arr[len]){
            min= len;
        }
        
        if(arr[max]<arr[len]){
            max= len;
        }
        
        min_max(arr, min , max , len-1);
        
        
    }
}


//output

// -11
// 8
