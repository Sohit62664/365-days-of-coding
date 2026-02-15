package Recursion.Patterns;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] num = {1,-5,3,6,9,3,67,56,45};
        sort(num , num.length , 0);
        System.out.println(Arrays.toString(num));
    }

    static int[] swap(int [] num , int j , int i){
        int temp = num[j];
        num[j]=num[i];
        num[i]= temp;
        return num;
    }

    static int[] helper(int [] num , int j){
        if(j >= num.length-1 ) return num;
        if(num[j]> num[j+1]) {
            swap(num , j , j+1);
        }
        return helper(num, j+1);

    }
    static int[] sort(int[] num , int n , int j){
        if(n<=0) return num;
        helper(num, j);

        return sort(num , n-1 , j+1);
    }
}
