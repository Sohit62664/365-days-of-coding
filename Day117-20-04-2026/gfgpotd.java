// class Solution {
//     public int derangeCount(int n) {
//         // code here
//         int product = 1;
//         boolean flag = true ; 
//         double a = 1 ;
//         double ans = 1;
//         for(int i = 1 ; i<= n ; i++){
//             product *= i;
//             if(flag){
//                 ans -=(a/product);
//                 flag = false ;
//             }else{
//                 ans +=(a/product);
//                 flag = true ;
//             }
//         }
        
//         int nw = int(ans) * (product) ;
//         return nw;
        
//     }
// };

class Solution {
    public int derangeCount(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int a = 0; // !1
        int b = 1; // !2

        for (int i = 3; i <= n; i++) {
            int temp = (i - 1) * (a + b);
            a = b;
            b = temp;
        }

        return b;
    }
}
