// package motorq;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int nums[] = new int[N];

            int M = Integer.MAX_VALUE;
            for(int i =0 ; i< N ; i++){
                nums[i]= sc.nextInt();
                M = Math.min(nums[i] , M);
            }

            int count =0;

            
            for(int i = 1 ; i < N ; i++){
                if(nums[i]!= M){
                    count++;
                }
            }

            System.out.println(count);
            T--;

        }
    }
}
