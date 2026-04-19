class Solution {
    public boolean isPower(int x, int y) {
        if(x == 1 && y > x)
        {
            return false;
        }
       
        double exponent = Math.log(y) / Math.log(x);
        int power = (int)Math.round(exponent);
        
        return Math.round(Math.pow(x, power)) == y;
    }
}
