import java.util.* ;

public class Solution{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        String p = sc.nextLine();
        
        for(int i = 0 ; i< p.length() ; i++){
            char ch = p.charAt(i);
            if(ch == 'H' || ch == 'Q'  || ch == '9'){
                System.out.println("YES");
                return ;
            }
        }
        System.out.println("NO");
    }
}
