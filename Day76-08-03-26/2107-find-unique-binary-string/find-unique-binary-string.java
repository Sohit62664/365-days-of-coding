class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        
        for(String s : nums) {
            st.add(Integer.parseInt(s, 2));
        }
        
        for(int i = 0; i < 17 ; i++) {
            if(!st.contains(i)) {
                String binary = Integer.toBinaryString(i);
                while(binary.length() < n) {
                    binary = "0" + binary;
                }
                return binary;
            }
        }
        
        return "";
    }
}