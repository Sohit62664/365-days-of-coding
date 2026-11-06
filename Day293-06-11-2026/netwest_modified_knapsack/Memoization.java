import java.util.Arrays;

class Solution_net_west {
    public static int rocketFuel(int N, int[] volume, int[] energy, int[] mass, int V, int M) {
        // N --> Number of fules
        // V --> Maximum Volume
        // M --> Maximum mass can be taken
        
        int dp [][][] = new int[N][V+1][M+1];

        for(int[][] twod : dp){
            for(int[] oned : twod){
                Arrays.fill(oned,-1);
            }
        }
        return f(N-1, V, M, volume, energy, mass , dp);
    }

    static int f(int i, int v, int m, int[] volume, int[] energy, int[] mass , int [][][] dp ) {
        if(i == 0) {
            if(m - mass[0] >= 0 && v - volume[0] >= 0) {
                return energy[0];
            } else {
                return 0;
            }
        }

        if(dp[i][v][m]!= -1) return dp[i][v][m];

        int np = 0 + f(i-1, v, m, volume, energy, mass , dp);

        int pi = Integer.MIN_VALUE;
        if(m - mass[i] >= 0 && v - volume[i] >= 0) {
            pi = energy[i] + f(i-1, v-volume[i], m-mass[i], volume, energy, mass , dp);
        }

        return dp[i][v][m] = Math.max(np, pi);
    }

    // Driver code added below. Original logic unchanged.
    public static void main(String[] args) {

        int[][] volume = {
            {2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6},
            {1, 2, 1},
            {5, 6, 7},
            {4, 3, 2, 5},
            {1, 2, 3, 4},
            {2, 3, 4},
            {2, 2, 2, 2},
            {2, 3, 4, 5, 1, 3}
        };

        int[][] energy = {
            {4, 5, 7},
            {6, 8, 10, 12},
            {10, 15, 20, 25},
            {5, 8, 4},
            {10, 20, 30},
            {10, 8, 7, 15},
            {10, 15, 20, 25},
            {10, 12, 20},
            {5, 10, 15, 20},
            {8, 12, 15, 20, 4, 10}
        };

        int[][] mass = {
            {3, 4, 5},
            {3, 2, 4, 5},
            {4, 5, 6, 7},
            {2, 3, 1},
            {6, 7, 8},
            {1, 2, 2, 3},
            {5, 4, 3, 2},
            {3, 2, 4},
            {3, 3, 3, 3},
            {3, 4, 5, 6, 2, 3}
        };

        int[] V = {5, 5, 6, 10, 3, 5, 100, 5, 4, 10};
        int[] M = {7, 5, 7, 10, 4, 100, 5, 5, 6, 12};

        int[] expected = {9, 14, 25, 17, 0, 15, 45, 22, 35, 38};

        for(int t = 0; t < volume.length; t++) {
            int result = rocketFuel(
                volume[t].length,
                volume[t],
                energy[t],
                mass[t],
                V[t],
                M[t]
            );

            System.out.println(
                "Test Case " + (t+1) +
                " | Expected: " + expected[t] +
                " | Actual: " + result +
                " | " + (result == expected[t] ? "PASS" : "FAIL")
            );
        }
    }
}

