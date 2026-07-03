class Solution {
    public int[] singleNumber(int[] nums) {
        int xorAll =  0;
        for(int n : nums) xorAll^= n ; 


        int diffBit = xorAll & (-xorAll);
        
        int a= 0  , b = 0 ;
        for(int n : nums ){
            if((n & diffBit)!= 0){
                a^=n ;
            }else{
                b^= n ; 
            }
        }

        return new int []{a,b};
        
    }
}


// Approach 2 O(nlogn) 

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =1 ; i < nums.length ; i+=2 ){
            int pre = nums[i-1];
            int curr = nums[i] ;

            if(pre == curr){
                nums [i-1] = Integer.MIN_VALUE ;
                nums[i] = Integer.MIN_VALUE ;
            }
        }

        boolean flag = false ;

        int a = 0 ; int b = 0 ; 

        for(int n : nums ){
            if(n!=Integer.MIN_VALUE && (!flag)){
                a = n ;
                flag = true ; 
            }else if(n != Integer.MIN_VALUE){
                b = n ;
            }
        }


        return new int[]{a,b};
    }
}


// Approach 3 

class Solution {
    public int[] singleNumber(int[] nums) {

        int[] ans = new int[2];
        int idx = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                ans[idx++] = nums[i++];

            } else {
                i += 2;
            }

        }

        return ans;

    }
}
