// https://codeforces.com/problemset/problem/734/A

import java.util.*;

public class Chess{
    public static void main(String [] a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        int A_count =0 ;
        int D_count = 0 ;
        
        for(int i=0 ; i< n ; i++){
            char ch = s.charAt(i);
            if(ch=='A'){
                A_count++;
            }else{
                D_count++;
            }
        }
        
        if(A_count == D_count){
            System.out.println("Friendship");
        }else if(A_count>D_count){
            System.out.println("Anton");
            
        }else{
            System.out.println("Danik");
            
        }
        
    }
}
