package org.example.strings;

public class googleQuestion {
    public static void main(String[] args) {
        int[][] land = {
                {1,1,1,0,1},
                {1,1,0,1,0},
                {0,1,1,1,0},
                {1,1,1,1,0},
                {1,1,1,1,1},
                {0,0,0,0,0},
        };
        grabLargeLand(land);
    }

    private static void grabLargeLand(int[][] land) {

        int row = land.length;          // number of rows
        int col = land[0].length;       // number of cols
        int max = 0;                    // max square side length
        // to find the start and end of land through index
        int maxRow = -1;                // row index of bottom-right corner of largest square
        int maxCol = -1;                // col index of bottom-right corner of largest square

        int[][] dp = new int[row][col];  // 2D array to fill if the condition matched

        // iterate matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (land[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        // On first row or first col, square can only be size 1
                        dp[i][j] = 1;
                    } else {
                        // Otherwise check top, left, and top-left diagonal
                        dp[i][j] = 1 + Math.min(dp[i - 1][j],
                                Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    }

                    // track max square found so far
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                } else {
                    dp[i][j] = 0; // no square can end on a 0
                }
            }
        }
        if(max > 0 ) {
            System.out.println("largest square side length : " + max);
            System.out.println("Area : " + max * max);
            System.out.println("Start of index : "+ "("+ (maxRow - max + 1 ) +" , " +( maxCol - max + 1) + ")");
            System.out.println("End of index : "+ "("+  (maxRow ) +" , " +( maxCol ) + ")"  );
        }
        else{
            System.out.println("No Square found");
        }
    }
}



