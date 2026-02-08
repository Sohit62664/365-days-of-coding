package Day25;

import java.util.Stack;

public class Simplify_path {
    class Solution {
        public String simplifyPath(String path) {
            String[] parts = path.split("/");
            Stack<String> stack = new Stack<>();
            for (String part : parts) {
                if (part.equals("") || part.equals("."))
                    continue;
                if (part.equals("..")) {
                    if (!stack.isEmpty())
                        stack.pop();
                } else {
                    stack.push(part);
                }
            }

            if (stack.isEmpty())
                return "/";

            StringBuilder result = new StringBuilder();
            for (String dir : stack) {
                result.append("/").append(dir);
            }

            return result.toString();
        }
    }
}
