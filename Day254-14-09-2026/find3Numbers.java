class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] < arr[j]) {

                    for (int k = j + 1; k < n; k++) {
                        if (arr[j] < arr[k]) {
                            ls.add(arr[i]);
                            ls.add(arr[j]);
                            ls.add(arr[k]);

                            return ls;
                        }
                    }
                }
            }
        }

        return ls;
    }
}
