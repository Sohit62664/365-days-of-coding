public class Dilevery {

    public int minimum(int[] travelTime) { // Wrong

        // Write your logic here
        // reach on the last
        int n = travelTime.length;
        int min_sum = Integer.MAX_VALUE;
        for (int skip = 1; skip < n; skip++) {
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                if (i != skip) {
                    sum += travelTime[i];
                }else {

                    sum+=1;
                }
            }
            min_sum = Math.min(sum, min_sum);
        }
        return min_sum ; 
    }


    public int minimum2(int[] travelTime) {
        //This is working Because we don't want to treverse the most expwensive place there we will take Shortcut
        int n = travelTime.length;
        // int min_sum = Integer.MAX_VALUE;
        int sum =0 ; 
        int max = travelTime[0];

        for(int i=0 ; i< n-1 ; i++){
            sum+= travelTime[i];
            max = Math.max(travelTime[i] , max);
        }

        return sum - max +1 ; 
    }


    public static void main(String[] args) {

        Dilevery obj = new Dilevery();

        int[] travelTime = { 5, 3, 8, 2, 6 };

        int result = obj.minimum2(travelTime);

        System.out.println(result);
    }
}
