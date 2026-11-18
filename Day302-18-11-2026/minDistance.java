class Solution {
    public int minDistance(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        return ff(w1 - 1, w2 - 1, word1, word2);
    }

    int ff(int i, int j, String s1, String s2) {
        if (i < 0) {
            // meaning i went through the String s1 nd but my length is 0 so i don't have much to match that's why i need to insert the remaing j elements
            return j + 1;

        }
        if (j < 0)
            return i + 1; // this much needs to delete becouse they are extra in s1

        if (s1.charAt(i) == s2.charAt(j)) { // already matched so no need the other operations
            return ff(i - 1, j - 1, s1, s2);
        }

        int delete = 1 + ff(i - 1, j, s1, s2); // let's delete the character and match with the remaiing one 
        int replace_it = 1 + ff(i - 1, j - 1, s1, s2); // replace the char i.e. it is got matched 
        int insert_it = 1 + ff(i, j - 1, s1, s2); // insert the character

        return Integer.min(delete, Math.min(replace_it, insert_it));
    }
}
