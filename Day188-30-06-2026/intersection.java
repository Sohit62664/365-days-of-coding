// Intersection

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashMap<Integer , Integer > map = new HashMap<>();
//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int x : nums1){
//             map.put(x , map.getOrDefault(x , 0)+1);
//         }

//         for(int x : nums2){
//             if(map.containsKey(x)){
//                 if(map.get(x)>0){
//                     ans.add(x);
//                     map.put(x , map.getOrDefault(x , 0)-1);
//                 }else if(map.get(x)==0){
//                     map.remove(x);
//                 }
//             }
//         }

//         int [] arr = new int[ans.size()];
//         int i= 0;
//         for(int x : ans){
//             arr[i]= x;
//             i++;
//         }

//         return arr;
//     }
// }





//Unique Intersection 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer > map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int x : nums1){
            map.put(x , map.getOrDefault(x , 0)+1);
        }

        for(int x : nums2){
            if(map.containsKey(x)){
                if(map.get(x)>0){
                    ans.add(x);
                    map.remove(x);
                }
            }
        }

        int [] arr = new int[ans.size()];
        int i= 0;
        for(int x : ans){
            arr[i]= x;
            i++;
        }

        return arr;
    }
}
