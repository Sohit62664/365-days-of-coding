import java.util.Scanner;

public class B {
    //minus-two
    public static void main(String [] aergs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int odd = 0 ; 
            int even_even = 0 ;
            int even_odd = 0 ;
            for(int i =0 ; i< n ; i++){
                int a = sc.nextInt();
                if(a%2 == 0){
                    int b = a/2 ; 
                    if(b%2 == 0){
                        even_even++;
                    }else{
                        even_odd++;
                    }
                }else{
                    odd++;
                }
            }

            int ans = Math.max(odd , Math.max(even_even , even_odd));

            System.out.println(ans);
        }
    }
}
