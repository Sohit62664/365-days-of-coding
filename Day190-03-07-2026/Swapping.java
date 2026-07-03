class Solution {
	public void swap(int a, int b) {
		// code here
		
		a = a^b ;
		b = a^b ;
		a = a^b ;

        // int temp = a ;
        // a = b ; 
        // b = temp ;
        
        // a = a+ b ;
        // b = a - b ;
        // a = a-b ; 
        
        
        // ArithmeticException
        // a = a * b;
        // b = a / b;
        // a = a / b;
        
        
        
        System.out.println(a + " " + b);
		
		
		
	}
}
