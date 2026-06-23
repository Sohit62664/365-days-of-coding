import java.util.Scanner;

public class Panoramixs_Prediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(!prime(m)){
            System.out.println("NO");
            return;
        }
        for(int i=n+1 ; i <=m ; i++){
            if(prime(i) &&i!=m){
                System.out.println("NO");
                return ; 
            }else if(prime(i) && i == m){
                System.out.println("YES");
                return ; 
            }

        }

        System.out.println("NO");
    }

    static boolean prime(int num){
        if(num == 1 || num== 2 ){
            return false ;
        }

        for(int i=2 ; i<= Math.sqrt(num) ; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
