
class Solution {
    // public int josephus(int n, int k) {
    //     // code here
    //     int ans = 0;
        
    //     for(int i =1 ; i<= n ; i++){
    //         ans = (ans+k)%i;
    //     }
    //     return ans +1 ;
        
    // }
    
    public int josephus(int n, int k) {
       ArrayList<Integer> num = new ArrayList<>();
       for(int i = 1 ; i<= n ; i++){
           num.add(i);
       }
       int ans = 0;
       while(num.size()>1){
           ans = (ans+k-1)%num.size();
           num.remove(ans);
       }
       return num.get(0);
    }
}
