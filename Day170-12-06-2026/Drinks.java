https://codeforces.com/problemset/problem/200/B


import java.util.*;

public class Drinks {
    public static void main(String a []){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0 ;
        for(int i=0  ; i < n ; i++ ){
            int val = sc.nextInt();
            sum += val;
        }
        
        double total = (double) sum;
        double ans = total / n ;
        
        System.out.println(ans);
    }
}
