class Solution {
    String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    List<String> ans = new ArrayList<>();

    void combinations(String digits, int i, StringBuilder current) {
        if (digits.length() == i) {
            ans.add(current.toString());
            return;
        }

        String str = map[digits.charAt(i)-'0'];

        for(int j = 0 ; j< str.length() ; j++){
            current.append(str.charAt(j));
            combinations(digits, i+1 , current);
            current.deleteCharAt(current.length()-1);
        }

    }
    

    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        combinations(digits, 0, sb);
        return ans;
    }
}
