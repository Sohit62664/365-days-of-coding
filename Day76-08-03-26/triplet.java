class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a*a);
        }
        
        for(int i = 0 ; i< arr.length ; i++){
            int a = arr[i];
            for(int j = i+1 ; j<arr.length ; j++){
                int b= arr[j];
                
                int search = a*a + b*b;
                if(set.contains(search)){
                    return true;
                }
                
            }
            
        }
        
        return false;
    }
}
