class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0 ; i< numbers.length ; i++){
            int compliment = target - numbers[i];
            int ans = bin_search(numbers , i+1 , numbers.length-1 , compliment);
            if(ans != -1 ){
                return new int [] {i+1 , ans+1};
            }
        }
        return new int []{-1,-1};
    }
    int bin_search(int [] numbers ,int st ,int end ,int target){
        while(st<=end){
            int mid = st+(end-st)/2 ;
            if(numbers[mid]== target){
                return mid;
            }else if(numbers[mid]>target){
                end = mid-1;
            }else{
                st = mid + 1;
            }
        }
        return -1;
    }
}
