// https://codeforces.com/problemset/problem/344/A

import java.util.*;

public class Magnets{

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    String [] s = new String[n];
    
    for(int i =0 ; i< n ; i++){
        s[i]= sc.next();
    }
    
    int count =0; 
    for(int i = 1 ; i< n ; i++){
        String pre = s[i-1];
        String curr = s[i];
        
        if(!pre.equals(curr)){
            count++;
        }
        
        
    }
    
    System.out.println(count+1);
}
}
