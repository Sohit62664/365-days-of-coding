//valid for small input 

import java.lang.*;
import java.io.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int T ;
		Scanner sc = new Scanner(System.in);
		T= sc.nextInt();
		
		while(T-->0){
		    int a,b,n;
		    a= sc.nextInt();
		    b= sc.nextInt();
		    n= sc.nextInt();
		    int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);

            System.out.println(fib(a, b, n, dp));
		  //  T--;
		}
		
		

	}
	
	static int fib(int a, int b, int n, int[] dp) {
    if (n == 0) return a;
    if (n == 1) return b;

    if (dp[n] != -1) return dp[n];

    return dp[n] = fib(a,b,n-1,dp) ^ fib(a,b,n-2,dp);
    
}
}
