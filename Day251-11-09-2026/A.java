import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =  sc.nextInt();
            int k = sc.nextInt();
            // System.out.println("s");
            String s = sc.next();
            
            int school = 0;
            for(int i =0 ; i < n ; i+=k){
                int st = i ;
                int end = i+k-1 ;
                int count =-1 ;

                for(int j = st ; j<= end ; j++){
                    if(s.charAt(j)== '0'){
                        count++;
                    }
                }
                // System.out.println("The count is" +count);

                if(count == -1){
                    school++;
                }
            }
            System.out.println(school);

        }
    }
}
