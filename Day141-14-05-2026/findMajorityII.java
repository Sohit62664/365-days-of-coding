class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int ele1 = -1 ;
        int ele2 = -1 ;
        int cnt1 = 0 ;
        int cnt2 = 0 ;
        
        for(int num : arr){
            if(num == ele1) cnt1++;
            else if(num == ele2) cnt2++;
            else if(cnt1==0 ){
                ele1 =num ;
                cnt1++;
            }else if(cnt2 == 0 ) {
                ele2 = num ;
                cnt2 =1;
            }else {
                cnt1--;
                cnt2--;
            }
        }
        
        cnt1=0;
        cnt2=0;
        
        
        for(int num : arr){
            if(num==ele1) cnt1++;
            if(num==ele2) cnt2++;
        }
        int n= arr.length;
        ArrayList<Integer>list = new ArrayList<>();
        if(cnt1>(n/3)) list.add(ele1);
        if(cnt2>(n/3)) list.add(ele2);
        
        Collections.sort(list);
        
        return list;
        
    }
}
