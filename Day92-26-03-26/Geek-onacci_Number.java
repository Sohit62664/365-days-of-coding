/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;


// Similar Question Like fibonachi series

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int A,B,C,N;
		    A= sc.nextInt();
		    B= sc.nextInt();
		    C= sc.nextInt();
		    N= sc.nextInt();
		    System.out.println(nth(A, B , C , N));
		}
		return;
	}
	static int nth(int a , int b , int c , int n){
		    if(n == 1) return a;
		    if(n == 2) return b;
		    if(n == 3) return c;
		    
		    return nth(a,b,c,n-1)+nth(a,b,c,n-2)+nth(a,b,c,n-3);
		}
}
