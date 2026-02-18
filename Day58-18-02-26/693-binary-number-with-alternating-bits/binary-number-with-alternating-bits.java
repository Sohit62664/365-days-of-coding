class Solution {

    boolean alternating(String binary){
        int n = binary.length ();
        if(n == 1) return true;
        if(n==2 && binary.charAt(0)!= binary.charAt(1)) return true; else if(n==2) return false;
        for(int i = 0 ; i< n ; i++){
            if(i+1 < n && binary.charAt(i)== binary.charAt(i+1)){
                return false;
            }
        }

        return true;
    }
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        return alternating(binary);
    }
}