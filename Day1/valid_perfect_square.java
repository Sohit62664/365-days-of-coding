package Day1;

class Solution {
    public boolean isPerfectSquare(int num) {
        // method 1 


        int i= 1 ;
        while(i< num/2){
            if(i*i==num){
                return true;
            }
            i++;
        }
        return false;

        //method 02
        int i= 1;
        while(i<= num){
            num-= i;
            i+=2;
        }
        if(num==0){
            return true;
        }else{
            return false;
        }
    }
}
