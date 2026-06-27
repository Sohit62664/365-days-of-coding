import java.util.*;


public class Solution144A{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int [] heights =  new int[n];
        for(int i = 0 ; i< n ;i++ ){
            int t = sc.nextInt();
            heights[i] = t;
        }
        int max = heights[0];
        int min = heights[0];
        
        for(int i=0 ; i< n ; i++){
            max = Math.max(max , heights[i]);
            min = Math.min(min , heights[i]);
        }
        
        int max_index = 0 ;
        
        for(int i=0 ; i< n ; i++){
            if(max == heights[i]){
                max_index = i ; 
                break ;
            }
        }
        
        //bringing it to front 
        int count = 0 ;
        while(max_index>0){
            // swap
            int temp = heights[max_index];
            heights[max_index] = heights[max_index-1];
            heights[max_index -1]  = temp;
            count++;
            max_index--;
        }
        
        
        int min_index = n-1 ;
        
        for(int i=n-1 ; i>=0 ; i--){
            if(min == heights[i]){
                min_index = i ;
                break ;
            }
        }
        
        while(min_index<n-1){
            // swap
            int temp = heights[min_index];
            heights[min_index] = heights[min_index+1];
            heights[min_index + 1]  = temp;
            count++;
            min_index++;
        }
        System.out.println(count);
    }
}
