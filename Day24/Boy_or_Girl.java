package Day24;

import java.util.*;

public class Boy_or_Girl{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String u_name= sc.nextLine();
        HashSet<Character> set = new HashSet();
        int count = 0;
        for(int i=0 ; i< u_name.length() ; i++){
            
            if(set.contains(u_name.charAt(i))){
                continue;
            }
            set.add(u_name.charAt(i));
            count++;
        }
        
        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
        
    }
}
