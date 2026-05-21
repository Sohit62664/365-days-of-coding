class Solution {
    public int romanToDecimal(String s) {
        // code here
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int num= 0;
        int n= s.length();
        
        
        for(int i =0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(i+1<n && map.get(ch) <map.get(s.charAt(i+1))){
                num-= map.get(ch);
            }else{
                num+=map.get(ch);
            }
            
        }
        
        return num;
    }
}


// by using function a little slower 
class Solution {
	public int romanToDecimal(String s) {
		// code here
		
		int num = 0;
		int n = s.length();
		
		for (int i = 0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			if (i + 1<n && value(ch) <value(s.charAt(i + 1))) {
				num -= value(ch);
			} else {
				num += value(ch);
			}
			
		}
		
		return num;
	}
	int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		
		return - 1;
	}
}
