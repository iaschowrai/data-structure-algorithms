package org.example.strings.hard;

import java.util.HashMap;

public class FindMaxSquareArea {
    public static void main(String[] args) {
        int[][] square = {
                {1,1,1,0,1},
                {1,1,0,1,0},
                {1,1,1,1,0},
                {1,1,1,1,0},
                {1,1,1,1,1},
                {0,0,0,0,0},
        };
        countSquaresMin2(square);
    }

    private static void countSquaresMin2(int[][] squares) {

        int row = squares.length;          // number of rows
        int col = squares[0].length;       // number of cols
        HashMap<Integer,Integer> counts = new HashMap<>();
        int[][] dp = new int[row][col];  // 2D array to fill if the condition matched

        // iterate matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (squares[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        // On first row or first col, square can only be size 1
                        dp[i][j] = 1;
                    } else {
                        // Otherwise check top, left, and top-left diagonal
                        dp[i][j] = 1 + Math.min(dp[i - 1][j],
                                Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    }

                    // Add contribution for squares ≥2
                    for (int size = 2; size <= dp[i][j]; size++) {
                        counts.put(size, counts.getOrDefault(size, 0) + 1);
                    }
                }
            }
        }
        System.out.println("Squares by size: " + counts);

    }
}



