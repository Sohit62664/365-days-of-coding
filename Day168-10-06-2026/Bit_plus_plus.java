import java.util.*;

public class Bit_plus_plus {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int x= 0 ;

        for(int i =0 ; i< n ; i++){
            String s = sc.nextLine();

            if(s.equals("X++") || s.equals("++X")){
                x++;
            }else{
                x--;
            }
        }

        System.out.println(x);

    }
}
