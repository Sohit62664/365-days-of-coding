class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Broute force Approach 

        int min = 201;

        for(String s : strs){
            min = Math.min(s.length() , min);
        }

        StringBuilder sb  = new StringBuilder();
        for(int i =0 ; i<min ; i++){
            char ch = strs[0].charAt(i);
            boolean flag = true;
            for(int j =0 ; j< strs.length ; j++){
                if(strs[j].charAt(i)!= ch){
                    flag = false ;
                }
            }

            if(flag){
                sb.append(ch);
            }else{
                break;
            }
        }

        return sb.toString();
    }
}



//Optimal Approach

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;

        System.out.println(Arrays.toString(strs));
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
