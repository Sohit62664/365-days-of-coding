class Solution {
    List<Integer> makeBeautiful(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {

            // if opposite signs
            if (!stack.isEmpty() && opposite(stack.peek(), num)) {
                stack.pop();
            } 
            else {
                stack.push(num);
            }
        }

        return new ArrayList<>(stack);
    }

    boolean opposite(int a, int b) {

        return (a >= 0 && b < 0) ||
               (a < 0 && b >= 0);
    }
}
