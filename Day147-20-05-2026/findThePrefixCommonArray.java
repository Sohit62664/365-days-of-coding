class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // using  set O(n^2) time and O(n) space 
        HashSet<Integer> setA = new HashSet<>();
        // HashSet<Integer> setB = new HashSet<>();

        // Brute force approach
        

        int n = A.length;
        int [] ans = new int[n];
        for(int i= 0 ; i< n ; i++){
            setA.add(A[i]);
            int common= 0 ;

            for(int j = 0 ; j<=i ; j++){
                if(setA.contains(B[j])){
                    common++;
                }
            }

            ans[i]= common;
        }

        return ans;


    }
}

// Optimize approach 
class Solution {

    public int[] findThePrefixCommonArray(int[] A,
                                          int[] B) {

        int n = A.length;

        int[] ans = new int[n];

        int[] freq = new int[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) {

            freq[A[i]]++;

            if (freq[A[i]] == 2) {
                common++;
            }

            freq[B[i]]++;

            if (freq[B[i]] == 2) {
                common++;
            }

            ans[i] = common;
        }

        return ans;
    }
}



