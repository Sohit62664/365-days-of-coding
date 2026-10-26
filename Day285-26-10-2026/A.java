import java.util.Scanner;

public class A {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            // System.out.println("");
            sc.nextLine();
            String s = sc.nextLine();

            for(int i =0 ; i < n ; i+=k){
                boolean flag = false;
                for(int j = i ; j< k+i ; j++){
                    if(j < s.length() && s.charAt(j) == '0'){
                        flag = true;
                        break ;
                    }
                }

                if(!flag){
                    count++; 
                }
            }
            System.out.println(count);
        }
    }
}
