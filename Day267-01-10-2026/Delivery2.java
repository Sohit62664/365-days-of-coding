public class Delivery2 {

    public int minimum(int[] travelTime, int k) {

        // Write your logic here

        // findout the sunbarray having maxsum 0f size k

        int sub_sum = 0;
        int n = travelTime.length;
        int left = 0;
        int w_sum = 0;
        int total_sum = 0;

        for (int right = 0; right < n; right++) {
            if (right - left + 1 > k) {
                w_sum -= travelTime[left];
                left++;
            }

            if (right - left + 1 == k) {
                sub_sum = Math.max(sub_sum, w_sum);
            }

            total_sum += travelTime[right];
            w_sum += travelTime[right];
        }

        return total_sum-sub_sum + 1;
    }

    public static void main(String[] args) {

        Delivery2 obj = new Delivery2();

        int[] travelTime = { 5, 3, 8, 2, 6 };
        int k = 2;

        int result = obj.minimum(travelTime, k);

        System.out.println(result);
    }
}
