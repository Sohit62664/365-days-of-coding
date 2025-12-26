package Day8;

public class Capacity_To_Ship_Packages_Within_D_Days {
    class Solution {
        public int shipWithinDays(int[] weights, int days) {
            // int mincapacity=0;
            // int maxcapacity = 0;
            // for(int i=0 ; i< weights.length ; i++){
            // mincapacity= Math.max(mincapacity, weights[i]);
            // maxcapacity+=weights[i];
            // }

            // int st = mincapacity;
            // int end= maxcapacity;
            // int capacity=st;

            // while(st<= end){
            // int mid = st + (end-st)/2;

            // int i=0 ;
            // long load = 0;
            // int day=0 ;
            // while(i<weights.length){
            // load+=weights[i];
            // if(load>mid){
            // load=0;
            // day++;
            // }
            // i++;
            // }

            // if(day<=days){
            // end= mid-1;
            // capacity= mid;
            // }else{
            // st= mid+1;
            // }

            // }
            // return capacity;

            int minCapacity = 0;
            int maxCapacity = 0;

            for (int i = 0; i < weights.length; i++) {
                minCapacity = Math.max(minCapacity, weights[i]);
                maxCapacity += weights[i];
            }

            int st = minCapacity;
            int end = maxCapacity;
            int capacity = maxCapacity;

            while (st <= end) {
                int mid = st + (end - st) / 2;

                int day = 1; // start from day 1
                int load = 0;

                for (int i = 0; i < weights.length; i++) {
                    if (load + weights[i] > mid) {
                        day++;
                        load = 0;
                    }
                    load += weights[i];
                }

                if (day <= days) {
                    capacity = mid;
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

            return capacity;
        }
    }

}
