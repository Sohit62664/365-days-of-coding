class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        
        ArrayList <Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
                ans.add(num);
            }
        }
        
        return ans; 
    }
}
