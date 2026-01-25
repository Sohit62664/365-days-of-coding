class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        // Stack <Integer> s = new Stack<>();
        int t = 0;
        for (int i = 1; i <= n && t < target.length; i++) {

            list.add("Push");

            if (i == target[t]) {
                t++;
                // s.pop();
            } else {
                list.add("Pop");
            }
        }
        return list;
    }
}