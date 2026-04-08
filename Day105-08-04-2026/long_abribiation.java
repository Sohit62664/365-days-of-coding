import java.util.Scanner;

public class long_abribiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-->0){
            String word = sc.next();
            int length = word.length();
            if(length>10){
                System.out.println("" + word.charAt(0)+ (length-2) + word.charAt(length-1));
            }else {
                System.out.println(word);
            }

        }
    }
}
