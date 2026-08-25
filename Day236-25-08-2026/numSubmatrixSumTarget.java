class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count = 0;

        int n = matrix.length;
        int m = matrix[0].length;
        for (int top = 0; top < n; top++) {
            int colsum[] = new int[m];

            for (int bottom = top; bottom < n; bottom++) {
                for (int i = 0; i < m; i++) {
                    colsum[i] += matrix[bottom][i];
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                //Never Forgot to initialize the map
                map.put(0, 1);
                int sum = 0;

                for (int i = 0; i < m; i++) {
                    sum += colsum[i];

                    int key = sum - target;
                    if (map.containsKey(key)) {
                        count += map.get(key);
                    }

                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }

        }
        return count;
    }
}
