package Recursion;

import java.util.Scanner;

public class remove_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s ="abcappleb";

        System.out.println(remove(s , 0 , s.length() ));
    }
    static String remove(String s, int st , int end){
        
        if(st >= end ) return "";
        if(st + 5 <= end && (s.substring(st, st+5).equals("apple"))){
            
            return remove(s, st+5 , end );
        }else{
            return s.charAt(st) + remove(s, st+1 , end );
        }
    }
}
