class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length-1];
        ans.add(max);
        for(int i = arr.length-2 ; i >= 0 ; i--){
            int num = arr[i];
            if(num>= max){
                max = num;
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
