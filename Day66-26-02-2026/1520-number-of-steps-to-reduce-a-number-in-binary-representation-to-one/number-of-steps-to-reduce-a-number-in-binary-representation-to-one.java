import java.math.BigInteger;
// class Solution {
//     public int numSteps(String s) {
//         return steps(Integer.parseInt(s,2) , 0 );
//     }
//     static int steps(int num , int count){
//         if(num == 1 ) return count;
//         count++;
//         if(num %2==0){
            
//             return steps(num/2 , count );
//         }else{
//             return steps(num+1 , count);
//         }
        
//     }
// }

class Solution {
    public int numSteps(String s) {
        return  steps(s , 0);
    }

    static int steps(String s , int count ){
        int l = s.length()-1 ;
        if (s.length()== 1 && s.charAt(l)== '1' ) return count;
        if(s.charAt(l)== '0'){
            return steps(s.substring(0, s.length() - 1) , count+1);
        }else{
            return steps(addOne(s) , count+1);
        }
    }

    static  String addOne(String s) {
        BigInteger x = new BigInteger(s, 2);   // parse binary string
        x = x.add(BigInteger.ONE);              // +1
        return x.toString(2);                   // back to binary string
    }

}