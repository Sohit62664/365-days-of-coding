import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class codevita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();// no.of Stocks
        int K = sc.nextInt();// countity of stock
        int A = sc.nextInt();// Capital

        double[] price = new double[N];
        double[] percentage = new double[N];

        for (int i = 0; i < N; i++) {
            double s = sc.nextDouble();
            price[i] = s;
        }

        for (int i = 0; i < N; i++) {
            double s = sc.nextDouble();
            percentage[i] = s;
        }

        // Solution

        // Approach
        // max percentage
        // buy continue till k
        // calculate profit
        // amount ;

        // for acessing max index
        HashMap<Double, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put((double) percentage[i], (double) price[i]);
        }

        Arrays.sort(percentage);
        double total = 0.0;
        for (int i = N - 1; i >= 0; i--) {
            // int prize_index = map.get(percentage[i]);
            double total_purchace = 0.0;
            int copy_k = K;
            double total_profit = 0.0;
            while (copy_k > 0 && A >= map.get(percentage[i])) {
                total_purchace += map.get(percentage[i]);
                A -= map.get(percentage[i]);

                // copy_k--;
                copy_k--;
            }
            total_profit += (total_purchace * ((percentage[i]) / 100));

            total += total_profit;
        }

        double nearestInt = Math.round(total);
        System.out.println(nearestInt);
        // System.out.println(total);
    }
}
