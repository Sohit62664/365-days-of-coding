package Day28;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Valid_Parentheses {
    class Solution {
        public boolean isValid(String s) {
            Deque<Character> st = new ArrayDeque<>();
            HashMap<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put('}', '{');
            map.put(']', '[');
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(' || ch == '[' || ch == '{') {
                    st.push(ch);
                } else if (ch == ']' || ch == '}' || ch == ')') {
                    if (st.peek() != map.get(ch)) {
                        return false;
                    } else {
                        st.pop();
                    }
                }
            }
            if (st.isEmpty()) {
                return true;
            }
            return false;
        }
    }
}
