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
