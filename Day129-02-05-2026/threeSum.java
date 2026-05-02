// class Solution {
//     public List<List<Integer>> threeSum(int[] num) {
//         List<List<Integer>> ans = new ArrayList<>();
//         HashMap<Integer, Integer> map = new HashMap<>();
//         HashSet<Integer> set = new HashSet<>();

//         for(int i = 0 ; i< num.length ; i++){
//             set.add(num[i]);
//         }

//         int [] nums = new int[set.size()];
//         int k = 0 ;
//         for(int i : set){
//             nums[k]= i; 
//             k++;
//         }

//         for(int i = 0 ; i< nums.length ; i++){
//             for(int j = i+1 ; j < nums.length ; j++){
//                 int compliment = 0-nums[i]-nums[j];
//                 if(map.containsKey(compliment)){
//                     ans.add(List.of(i,j,map.get(compliment)));
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i++){
            if(i> 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i+1 ;
            int right = nums.length -1 ;

            while(left<right){
                
                int sum = nums[i] +nums[left] + nums[right];

                if(sum == 0){
                    ans.add(Arrays.asList(nums[i] , nums[left], nums[right]));
                    //left duplicate 
                    while(left<right && nums[left]== nums[left+1]) left++;
                    //right duplicate 
                    while(left<right && nums[right]== nums[right-1]) right--;
                    right--;
                    left++;

                }else if(sum<0){
                    left++;

                }else{
                    right--;
                }
            }
            
        }
        return ans;
    }
}
