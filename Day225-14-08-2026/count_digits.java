
// public class count_digits {

//     static int count(int n , int m){
//         if(n == 0 ) return m;
//         return    count(n/10 , m+1);
    
//     }
//     public static void main(String[] args) {
//         System.out.println(count(12345 , 0));
//     }
// }



public class count_digits {

    static int count(int n ){
        if(n<10) return 1 ;
        return 1+ count(n/10);    
    }
    public static void main(String[] args) {
        System.out.println(count(12345 ));
    }
}