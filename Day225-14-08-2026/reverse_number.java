public class reverse_number {

    static int reverse(int n , int num ){
        if(n == 0  ) return num ; 
        // num *= 10 + (n%10);
        return reverse(n/10 ,(num * 10 )+ (n%10));

        // return num ;
    }
    public static void main(String[] args) {
        System.out.println(reverse(12345 , 0));
    }
}
