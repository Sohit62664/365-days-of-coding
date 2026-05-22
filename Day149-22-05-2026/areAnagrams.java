class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        // naive approach using sorting
        
        char [] arr1 = s1.toCharArray(); 
        char [] arr2 = s2.toCharArray(); 
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1,arr2)){
            return true;
        }else{
            return false;
        }
    }
}
