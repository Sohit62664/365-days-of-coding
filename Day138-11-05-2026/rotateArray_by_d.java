Left Rotation by 2

Move first 2 elements to end:

3 4 5 6 1 2

Right Rotation by 2

Move last 2 elements to front:

5 6 1 2 3 4




For left rotation by d, reversal algorithm is: gfg rotate by d
1. Reverse first d elements 
2. Reverse remaining n-d elements 
3. Reverse whole array
reverse(0, d - 1);
reverse(d, n - 1);
reverse(0, n - 1);


For right rotation by d, reversal algorithm is: leetcode lotate by k

1.Reverse whole array
2.Reverse first d elements
3.Reverse remaining n-d elements

reverse(0, n - 1);
reverse(0, d - 1);
reverse(d, n - 1);


// left (counter-clockwise direction)


class Solution {
	static void rotateArr(int arr[], int d) {
		// code here
		int n = arr.length ;
		d = d%n; // if d< n then remain d if d> n then d = d%n 
		reverse(0, d - 1, arr);
		reverse(d, n - 1, arr);
		reverse(0, n - 1, arr);
		 
		return ;
		
	}
	static void reverse(int i, int j, int[] arr) {
		while (i<j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
		return;
	}
}
