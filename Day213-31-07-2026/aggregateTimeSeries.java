class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int n1 = series1.length;
        int n2 = series2.length;

        HashMap<Integer, Integer> set1 = new HashMap<>();
        HashMap<Integer, Integer> set2 = new HashMap<>();

        int m1= 0 ; 
        for (int[] times : series1) {
            set1.put(times[0], times[1]);
            m1= Math.max(times[0] , m1);
        }
        int m2 = 0 ;
        for (int[] times : series2) {
            set2.put(times[0], times[1]);
            m2= Math.max(times[0],m2);
        }

        int timestamp[] = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < n1 && j < n2) {
            if (series1[i][0] < series2[j][0]) {
                timestamp[index] = series1[i][0];
                index++;
                i++;
            } else {
                timestamp[index] = series2[j][0];
                index++;
                j++;
            }

        }

        while (i < n1) {
            timestamp[index] = series1[i][0];
            index++;
            i++;
        }

        while (j < n2) {
            timestamp[index] = series2[j][0];
            index++;
            j++;
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int time : timestamp) {
            // in series1
            int v1 = 0;
            int v2 = 0;
            if (set1.containsKey(time)) {
                v1 = set1.get(time);
                for(int k = time+1 ; k<= m2 ; k++){
                    if(set2.containsKey(k)){
                        v1 += set2.get(k);
                        break;
                    }
                }
            } 

            // in series2

            if (set2.containsKey(time)) {
                v2 = set2.get(time);
                for(int k = time+1 ; k<= m1 ; k++){
                    if(set1.containsKey(k)){
                        v2 += set1.get(k);
                        break;
                    }
                }
            }

            ArrayList<Integer> list = new ArrayList<>();
            list.add(time);
            int total = v1 + v2;
            list.add(total);
            ans.add(list);
        }

        return ans;

    }
}
