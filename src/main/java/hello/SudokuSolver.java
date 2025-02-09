package hello;

public class SudokuSolver {

    public static int[][] sudoku(int[][] puzzle) {
         solve(puzzle);
      return puzzle;
   }
  
    private static boolean solve(int[][] puzzle) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (puzzle[row][col] == 0) {  // Look for an empty cell
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(puzzle, row, col, num)) {
                            puzzle[row][col] = num;  // Place num
                            
                            if (solve(puzzle)) {  // Recursively attempt to solve from here
                                return true;
                            } else {
                                puzzle[row][col] = 0;  // Reset on failure
                            }
                        }
                    }
                    return false;  // Trigger backtracking
                }
            }
        }
        return true;  // Puzzle is solved
    }

    private static boolean isSafe(int[][] puzzle, int row, int col, int num) {
        // Check row
        for (int i = 0; i < 9; i++) {
            if (puzzle[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (puzzle[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 sub-grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (puzzle[i][j] == num) {
                    return false;
                }
            }
        }

        return true;  // No conflicts, safe to place num
    }
}
