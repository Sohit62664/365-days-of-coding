class Solution {
    public void printNos(int n) {
        // Code here
        printer(n , 1);
        return ;
    }
    
    void printer(int n ,   int i ){
        if(i >n ) return;
        System.out.print(i + " ");
        printer(  n , i+1 );
    }
}

