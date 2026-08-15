public class sum_of_Digits {

    static int sum(int n){
        if(n < 10) return n ; 

        return n%10 + sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
