package hello;

public class SudokuSolver {
    private static final int SIZE = 9; // Define the size of the Sudoku grid
 
    public static int[][] sudoku(int[][] b) {
        if (solveSudoku(b)) {
            return b; // Return the solved board
        } else {
            return null; // Return null if the puzzle cannot be solved
        }
    }
 
    private static boolean solveSudoku(int[][] b) {
        int r = -1;
        int c = -1;
        boolean isVacant = true;
 
        // Find an empty cell
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (b[i][j] == 0) {
                    r = i;
                    c = j;
                    isVacant = false;
                    break;
                }
            }
            if (!isVacant) {
                break;
            }
        }
 
        // If no empty cell is found, the puzzle is solved
        if (isVacant) {
            return true;
        }
 
        // Otherwise, try filling the cell with numbers 1-9
        for (int no = 1; no <= SIZE; no++) {
            if (isSafe(b, r, c, no)) {
                b[r][c] = no; // Place the number
 
                // Recursively attempt to solve the rest of the board
                if (solveSudoku(b)) {
                    return true;
                }
 
                // If the guess didn't lead to a solution, reset the cell
                b[r][c] = 0;
            }
        }
 
        return false; // Trigger backtracking
    }
 
    private static boolean isSafe(int[][] b, int row, int col, int num) {
        // Check if the number is not in the current row
        for (int x = 0; x < SIZE; x++) {
            if (b[row][x] == num) {
                return false;
            }
        }
 
        // Check if the number is not in the current column
        for (int x = 0; x < SIZE; x++) {
            if (b[x][col] == num) {
                return false;
            }
        }
 
        // Check if the number is not in the current 3x3 box
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i + boxRowStart][j + boxColStart] == num) {
                    return false;
                }
            }
        }
 
        return true; // Safe to place the number
    }
 
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
 
        System.out.println("Original Sudoku:");
        printBoard(board);
 
        int[][] solvedBoard = sudoku(board);
 
        System.out.println("\nSolved Sudoku:");
        printBoard(solvedBoard);
    }
 
    private static void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int d = 0; d < SIZE; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.print("\n");
        }
    }
 }
 
 