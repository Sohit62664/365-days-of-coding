// sort the array

// now we need to make smallest number equal to largest number 

// take pointer end which point to last and start which point to first number in array

// so first number is smallest and last number is largest 

// by subtracting we get our move 

// now the smallest number is equal to largest but with the move other number also increase

// so we need to make them equal also 

// since array is sorted and we did not increase last number 

// so now the largest number is seocnd last number in array as all numbers is increased expect last 

// and the smallest number is first number only

// so simillar step we do till our end is not reach to the start

// (we do not need to look for last number as it will automatically equal to the largest number as it is same as smallest number after 1 step)

// keep the move add in each step gives us the answer



class Solution {
    public int minOps(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int st = 0 ;
        int end = arr.length-1 ;
        int moves = 0 ;
        
        while(end>st){
            arr[end]+=moves;
            moves+= arr[end]- arr[st];
            arr[st]= arr[end];
            end--;
        }
        
        
        return moves;
    }
}




// Increasing n-1 elements by 1 is equivalent to decreasing one element by 1.
// So instead of increasing others, think of reducing larger elements.
// To minimize operations, make all elements equal to the minimum element.

// Each element needs:

// arr[i]−min

// operations to become minimum.

// Total operations:

// ∑(arr[i]−min)

class Solution {
	public int minOps(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for (int num : arr) {
			min = Math.min(min, num);
		}
		
		int ops = 0;
		
		for (int num : arr) {
			ops += (num - min);
		}
		
		return ops;
	}
}

