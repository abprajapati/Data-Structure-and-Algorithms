// can we find a sudoku solution if yes then print one solution to the console
public class Sudoku {
    public static boolean isSafe(int sudokuArr[][], int row, int col, int digit) {
     for(int i=0;i<9;i++){
         if(sudokuArr[i][col]==digit) {
             return false;
         }
     }

     for(int j=0;j<9;j++){
         if(sudokuArr[row][j]==digit){
             return false;
         }
     }
      int sx = (row/3)*3;
        int sy = (col/3)*3;
     for(int i=sx; i<sx+3; i++){
         for(int j=sy; j<sy+3; j++){
             if(sudokuArr[i][j]==digit){
                 return false;
             }
         }
     }
     return true;
    }

    public static boolean sudokuSolver(int sudokuArr[][], int i, int j){
        // base case
        if(i == 9) {
            return true;
        }

        int nextI=i, nextJ=j+1;
        if(j+1 == 9) {
            nextI = i+1;
            nextJ = 0;
        }

        //already placed
        if(sudokuArr[i][j] != 0) {
            return sudokuSolver(sudokuArr, nextI, nextJ);
        }

        for(int n=1; n<=9; n++) {
            if(isSafe(sudokuArr, i, j, n)) {
                sudokuArr[i][j] = n;
                if(sudokuSolver(sudokuArr, nextI, nextJ)) {
                    return true;
                }
                sudokuArr[i][j] = 0;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int[][] sudokuArr = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3} };

    if(sudokuSolver(sudokuArr, 0, 0)) {
 for(int i=0;i<=8;i++){
     for(int j=0;j<=8;j++){
         System.out.print(sudokuArr[i][j] + " ");
     }
     System.out.println();
 }
    }
    }

}
