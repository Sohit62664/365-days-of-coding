package Recursion;

import java.util.Scanner;

public class remove_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(remove(s , 0 , s.length() ));
    }
    static String remove(String s, int st , int end){
        
        if(st >= end ) return "";
        if(s.charAt(st)!= 'a'){
            
            return s.charAt(st) + remove(s, st+1 , end );
        }else{
            return remove(s, st+1 , end );
        }
    }
}
