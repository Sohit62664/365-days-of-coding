package Day11;

import java.util.HashSet;

public class Valid_Sudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashSet<Character>[] rows = new HashSet[9];
            HashSet<Character>[] cols = new HashSet[9];
            HashSet<Character>[] boxes = new HashSet[9];

            for (int i = 0; i < 9; i++) {
                rows[i] = new HashSet<>();
                cols[i] = new HashSet<>();
                boxes[i] = new HashSet<>();

            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char ch = board[i][j];
                    if (ch == '.')
                        continue;

                    if (rows[i].contains(ch))
                        return false;
                    rows[i].add(ch);
                    if (cols[j].contains(ch))
                        return false;
                    cols[j].add(ch);

                    int box_index = (i / 3) * 3 + (j / 3);

                    if (boxes[box_index].contains(ch))
                        return false;
                    boxes[box_index].add(ch);
                }
            }

            return true;
        }
    }
}
