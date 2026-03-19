class Solution {
    public List<String> letterCombinations(String digits) {
        
        return combination("", digits);
    }

    ArrayList<String> combination(String pr, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(pr);
            return ans;
        }
        int digit = up.charAt(0) - '0';// converting to the integer value (ascaii value) (char -48)
        digit= digit -1  ;
        ArrayList<String> ans = new ArrayList<>();


        for (int i = (digit-1)*3; i < (digit) * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combination(pr + ch, up.substring(1)));
        }
        return ans;

    }
}
