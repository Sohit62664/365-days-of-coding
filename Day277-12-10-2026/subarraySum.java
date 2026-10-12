
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left = 0 ; 
        int sum =0 ;
        for(int i=0 ; i < arr.length ; i++ ){
            
            sum += arr[i];
            
            while(sum > target){
                sum -= arr[left];
                left++;
            }
            if(sum == target){
                return new ArrayList<>(Arrays.asList(left+1 , i+1));
            }
        }
        
        return new ArrayList<>(Arrays.asList(-1));
    }
}





class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , -1);
        int sum =0 ; 
        for(int i =0 ; i< arr.length ; i++){
            sum+= arr[i];
            int key = sum - target;
            
            if(map.containsKey(key)){
                return new ArrayList<>(Arrays.asList(map.get(key)+2 , i+1));
            }
            map.putIfAbsent(sum , i);
        }
        
        return new ArrayList<> (Arrays.asList(-1));
    }
}
