package Day17;

public class Four_Division {
    /* 
    Brute force Approach
class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int i=0 ; i< nums.length ; i++){
            int sum= 0;
            int count=0;
            int last = 0;
            for(int j =1 ; j<= nums[i] ; j++ ){
                if(nums[i] % j == 0 ){
                    sum+=j;
                    count++;
                    if(nums[i]==j && count == 4){
                        ans += sum;
                    }
                    if(count > 4){
                        break;
                    }
                }
            }
        }        
        return ans ;
    }
}


*/


// Optimize code 

class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + 1;
            int count = 2;
            for (int j = 2; j * j <= nums[i]; j++) {
                if (nums[i] % j == 0) {
                    sum += j;
                    sum += nums[i] / j; // Finding the pair of the divisor 
                    if (nums[i] / j == j) { // In Cace of Perfect Square 
                        count++;
                    } else {
                        count += 2;
                    }

                    if (count > 4) {
                        break;
                    }
                }
            }
            if (count == 4) {
                ans += sum;
            }
        }
        return ans;
    }
}
}
