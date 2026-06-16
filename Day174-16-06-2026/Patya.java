import java.util.Scanner;

public class Patya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0 ;
        while(n>0){
            long rem = n % 10;
            int r = (int) rem;
            if(r == 4 || r == 7){     
                count++;
            }
            n/=10;
        }
        isLuckey(count);
    }

    static void isLuckey(int n){
        if(n==0) {
            System.out.println("NO");
            return ; 
        }

        while(n>0){
            long rem = n % 10;
            int r = (int) rem;
            if(r!= 4 && r != 7){
                System.out.println("NO");
                return ;
            }

            n/=10;
        }

        System.out.println("YES");
        return;
    }
}
