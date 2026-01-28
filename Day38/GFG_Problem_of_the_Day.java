package Day38;

import java.util.HashMap;

public class GFG_Problem_of_the_Day {
    class Solution {
    public int countSubset(int[] arr, int k) {
        // code here
        // Subset sum= k 
        // Broute force go to evey subset and take sum then increment 
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        int count = 0;
        
        for(int i :arr){
            int copy_k=k;
            while(copy_k>0 &&)
            if(i>k){
                continue;
            }else if(copy_k>=i){
                if(map.get(i) != 0){
                    copy_k-=i;
                    
                }
                
            }
        }

    }
}

}
