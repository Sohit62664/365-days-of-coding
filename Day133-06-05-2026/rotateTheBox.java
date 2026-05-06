class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {

        int m = boxGrid.length;
        int n = boxGrid[0].length;

        // gravity simulation
        for (int i = 0; i < m; i++) {

            int empty = n - 1;

            for (int j = n - 1; j >= 0; j--) {

                // obstacle
                if (boxGrid[i][j] == '*') {
                    empty = j - 1;
                }

                // stone
                else if (boxGrid[i][j] == '#') {

                    // move stone to rightmost empty place
                    char temp = boxGrid[i][empty];
                    boxGrid[i][empty] = '#';
                    boxGrid[i][j] = temp;

                    empty--;
                }
            }
        }

        char[][] box = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                box[j][m - 1 - i] = boxGrid[i][j];

            }
        }
        return box;
    }
}


// class Solution {
//     public char[][] rotateTheBox(char[][] boxGrid) {
//         for (char[] row : boxGrid) {
//             int st = 0;
//             int end = 0;
//             int count = 0;
//             int has_count = 0;
//             // int st_count = 0;
//             for (int i = 0; i < row.length; i++) {
//                 if (row[i] == '*') {
//                     // st_count++;
//                     end = i;
//                 } else if (row[i] == '.') {
//                     count++;
//                 } else {
//                     has_count++;
//                 }
//                 if (st < end) {
//                     // process when * appears
//                     for (int j = st; j < end; j++) {
//                         if (count != 0) {
//                             row[j] = '.';
//                             count--;
//                         } else {
//                             row[j] = '#';
//                         }
//                     }
//                     count = 0;
//                     st = end + 1;
//                     count= 0;
//                     has_count = 0 ;

//                 }
//             }
//             //process after last star
//             if(end!= 0){
//                 for(int i = end+1 ; i<row.length ; i++){
//                     if (count > 0) {
//                             row[i] = '.';
//                             count--;
//                         } else if (has_count > 0) {
//                             row[i] = '#';
//                             has_count--;
//                         }
//                 }
//             }

//             //process when no star available
//             if (end == 0) {
//                 if (count != 0) {
//                     for (int i = 0; i < row.length; i++) {
//                         if (count > 0) {
//                             row[i] = '.';
//                             count--;
//                         } else if (has_count > 0) {
//                             row[i] = '#';
//                             has_count--;
//                         }
//                     }
//                 }
//             }
//         }
//         return boxGrid;
//     }
// }
