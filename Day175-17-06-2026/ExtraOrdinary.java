import java.util.*;

public class ExtraOrdinary{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i< a.length() ; i++){
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            
            if(ch1 != ch2){
                ans.append("1");
            }else{
                ans.append("0");
            }
        }
        
        System.out.println(ans.toString());
    }
}
