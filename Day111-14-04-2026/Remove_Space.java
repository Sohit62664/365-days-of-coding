// class Solution {
//     String removeSpaces(String S) {
//         // code here
       
//         String result = S.replaceAll("\\s+", ""); 
//         return result;

//     }
// }

class Solution {
    String removeSpaces(String S) {
        // code here
       
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< S.length() ; i++){
            if(S.charAt(i)!=' '){
                sb.append(S.charAt(i));
            }
        }
        
        return sb.toString();

    }
}
