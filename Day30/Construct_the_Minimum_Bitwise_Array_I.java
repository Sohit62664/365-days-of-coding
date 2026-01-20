package Day30;

import java.util.Arrays;
import java.util.Scanner;

public class Construct_the_Minimum_Bitwise_Array_I
 {
    public static void main(String[] args) {
        
        int [] nums = {11,13,31};

        int n = nums.length;
        int [] ans = new int[n];
        int i =0 ;
        for(int x : nums){
            ans[i]=helper(x);
            i++;
        }      
        
        System.out.println(Arrays.toString(ans));
    }


    public static int or(int a ){
        return (a|a+1);
    }
    public static int helper(int a ){
        for(int i =1 ; i< a ; i++){
            if(or(i) == a ){
                return i;
            }
        }

        return -1 ;
    }
}

