class Solution {
    public List<List<Integer>> findIntersection(List<List<Integer>> arr1,
List<List<Integer>> arr2) {
            List<List<Integer>> ans  = new ArrayList<>();
            int i= 0, j =0 ;
            
            while(i<arr1.size () && j < arr2.size()){
                int a = Math.max(arr1.get(i).get(0) ,arr2.get(j).get(0) );
                int b = Math.min(arr1.get(i).get(1) ,arr2.get(j).get(1) );
                //
                if(a<=b){
                    ans.add(new ArrayList<>(Arrays.asList(a, b)));
                }
                if(arr1.get(i).get(1) < arr2.get(j).get(1)){
                    i++;
                }else{
                    j++;
                }
            }
                
                
            return ans;
     }
} 
