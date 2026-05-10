// User function Template for Java

class Solution {

    int minOperations(int a[], int N) {
        // Code here
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i< N ; i++){
            max = Math.max(a[i], max);
        }
        int max_count = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i< N ; i++){
            if(max==a[i]){
                max_count++;
                list.add(i);
            }
        }
        
        if(max_count == 1){//unique;
            return 0;
        }else{
            if(adjacent(list)){
                return 0;
            }else{
                return max_count-mlg(list);
            }
        }
    }
    
    boolean adjacent(ArrayList<Integer> list){
        for(int i= 1 ; i< list.size() ; i++){
            if(list.get(i)!= list.get(i-1)+1) return false;
        }
        return true;
    }
    
    int mlg(ArrayList<Integer> list){
        int gcount= 1;
        int max_count = 0;
        for(int i = 1 ; i< list.size() ; i++){
            if(list.get(i)!= list.get(i-1)+1){
                max_count = Math.max(max_count , gcount);
                gcount= 1 ;
            }else{
                gcount++;
            }
        }
        max_count = Math.max(max_count , gcount);
        
        return max_count;
    }
}
