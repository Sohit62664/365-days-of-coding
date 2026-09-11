import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            ArrayList<Integer> neg = new ArrayList<>();

            ArrayList<Integer> pos = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                if (a[i] == -1) {
                    neg.add(i);
                }
                if (a[i] == 1) {
                    pos.add(i);
                }
            }

            // case 1
            if (pos.size() >= 2) {
                for (int i : neg) {
                    a[i] = 0;
                }
            }

            // case 2 Exactly One Fixed
            else if (pos.size() == 1) {
                int l = neg.get(0);
                int r = neg.get(neg.size() - 1);

                if (Math.abs(l - pos.get(0)) > Math.abs(r - pos.get(0))) {

                    // all to 0 ;
                    for (int i : neg) {
                        a[i] = 0;
                    }
                    a[l] = 1;
                } else {

                    for (int i : neg) {
                        a[i] = 0;
                    }
                    a[r] = 1;
                }
            }

            // case 3 No fixed 1
            else if (pos.size() == 0) {
                int l = neg.get(0);
                int r = neg.get(neg.size() - 1);
                for (int i : neg) {
                    a[i] = 0;
                }
                a[l] = 1;
                a[r] = 1;
            }
            // case 4

            else if (neg.size() == 1) {
                a[neg.get(0)] = 0;

            }

            System.out.println(Arrays.toString(a));
        }
    }
}




// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// public class C {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();

//         while (t-- > 0) {

//             int n = sc.nextInt();

//             int[] a = new int[n];

//             ArrayList<Integer> neg = new ArrayList<>();
//             ArrayList<Integer> pos = new ArrayList<>();

//             for (int i = 0; i < n; i++) {

//                 a[i] = sc.nextInt();

//                 if (a[i] == -1) {
//                     neg.add(i);
//                 }

//                 if (a[i] == 1) {
//                     pos.add(i);
//                 }
//             }

//             // Case 1: At least 2 fixed 1s
//             if (pos.size() >= 2) {

//                 for (int i : neg) {
//                     a[i] = 0;
//                 }

//             }

//             // Case 2: Exactly 1 fixed 1
//             else if (pos.size() == 1) {

//                 // No -1 available
//                 if (neg.size() == 0) {
//                     // Nothing to change
//                 }

//                 else {

//                     int p = pos.get(0);

//                     int l = neg.get(0);
//                     int r = neg.get(neg.size() - 1);

//                     int best;

//                     if (Math.abs(l - p) > Math.abs(r - p)) {
//                         best = l;
//                     } else {
//                         best = r;
//                     }

//                     // Make all -1 -> 0
//                     for (int i : neg) {
//                         a[i] = 0;
//                     }

//                     // Make farthest -1 -> 1
//                     a[best] = 1;
//                 }
//             }

//             // Case 3: No fixed 1
//             else {

//                 // All -1 -> 0 first
//                 for (int i : neg) {
//                     a[i] = 0;
//                 }

//                 // Need at least 2 -1s to create a score
//                 if (neg.size() >= 2) {

//                     int l = neg.get(0);
//                     int r = neg.get(neg.size() - 1);

//                     a[l] = 1;
//                     a[r] = 1;
//                 }

//                 // If exactly one -1, score will remain 0
//             }

//             System.out.println(Arrays.toString(a));
//         }
//     }
// }
