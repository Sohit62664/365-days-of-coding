import java.util.*;

public class Patyas_Gift{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int [] ans = new int[n+1] ; 
        
        for(int i= 0 ; i< n ; i++){
            int pi = sc.nextInt();
            ans[pi]= i+1 ;
        }

        for(int i = 1 ; i<=n ; i++){
            System.out.print(ans[i]+ " ");
        }
        // System.out.println(Arrays.toString(ans));
    }
}
