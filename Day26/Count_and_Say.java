package Day26;

public class Count_and_Say {
    class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = rle(s);
        }
        return s;
    }

    // private String rle(String s) {
    //     StringBuilder sb = new StringBuilder();
    //     int count = 1;
    //     for (int i = 1; i < s.length(); i++) {
    //         if (s.charAt(i) == s.charAt(i - 1)) {
    //             count++;
    //         } else {
    //             sb.append(count).append(s.charAt(i - 1));
    //             count = 1;
    //         }
    //     }
    //     sb.append(count).append(s.charAt(s.length() - 1));
    //     return sb.toString();
    // }

    public String rle(String s){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i< s.length() ; ){
            int j = i+1 ; 
            int count=1;
            char ch = s.charAt(i);
            while(j<s.length() && s.charAt(j)==ch){
                count++;
                j++;
            }
            
            sb.append(count).append(ch);
            i=j;
        }

        return sb.toString();
    }
}

}
