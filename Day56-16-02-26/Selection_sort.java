package Recursion.Patterns;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int [] num = {1,-5,3,6,9,3,67,-56,-45};
        selection_sort(num, num.length , 0);
        System.out.println(Arrays.toString(num));
    }

    static int min_finder(int [] num , int j, int i){
    
        if(j == num.length) return i;
        if(num[j] < num[i]) i = j;
        return min_finder(num, j+1, i);
    }
    
    static int[] selection_sort(int [] num ,int n , int j ){
        if(j== n-1 ) return num;

        int min = min_finder(num,j, j );
        int temp = num[min];
        num[min]= num[j];
        num[j]= temp;
        return selection_sort(num, n , j+1);

    }
}
