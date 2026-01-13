package Day24;

import java.util.*;

public class Word_Capitalization{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder builder = new StringBuilder(s);
        char ch = builder.charAt(0);
        if(ch>='a' && ch<='z'){
            ch= (char) (ch- 32);
        }
        builder.setCharAt(0, ch);
        System.out.println(builder.toString());
    }
}
