import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("n = a power x ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        
        if (check(n , a)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    static boolean check (int n  , int a){
        if(n == 1 ) return true;
        
        if(n%a == 0 ){
            return check(n/a , a);
        }else{
            return false;
        }
    }
}
