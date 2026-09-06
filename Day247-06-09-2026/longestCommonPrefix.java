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
