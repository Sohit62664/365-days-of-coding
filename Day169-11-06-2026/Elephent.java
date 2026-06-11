// https://codeforces.com/problemset/problem/617/A

import java.util.*;

public class Elephent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(x%5==0){
            System.out.println(x/5);
        }else{
            System.out.println((x/5)+1);
        }
    }
}
