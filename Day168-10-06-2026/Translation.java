import java.util.*;
public class Translation {
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean flag = true;
        int n = s.length();

        if(n != t.length()){
            System.out.println("NO");
            return ;
        }
        for(int i = 0 ; i< n ; i++){
            if(s.charAt(i) != t.charAt(n-i-1)){
                System.out.println("NO");
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("YES");
        }
    }
}
