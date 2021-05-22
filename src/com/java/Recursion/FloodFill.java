package com.java.Recursion;

import java.util.Arrays;

public class FloodFill {

    public static void main(String[] args) {
        int[][] a = {{1,1,1,1,1,1,1,1},
                     {1,1,1,1,1,1,0,0},
                     {1,0,0,1,1,0,1,1},
                     {1,2,2,2,2,0,1,0},
                     {1,1,1,2,2,0,1,1},
                     {1,1,1,2,2,2,2,0},
                     {1,1,1,1,1,2,1,1},
                     {1,1,1,1,1,2,2,1}};
        FloodFillMatrix obj = new FloodFillMatrix();
        obj.fillMatrixColor(a, 4,3,3,2);
        System.out.println(Arrays.deepToString(a));
    }
}

class FloodFillMatrix {

    public void fillMatrixColor(int[][] a, int r, int c, int fillColor, int prevColor ) {
        int rows = a.length;
        int col = a[0].length;
        if (r < 0 || c < 0 || r>=rows || c>=col) {
            return;
        }
        if (a[r][c] != prevColor) {
            return;
        }
        a[r][c] = fillColor;
        fillMatrixColor(a, r-1, c, fillColor, prevColor);
        fillMatrixColor(a, r, c-1, fillColor, prevColor);
        fillMatrixColor(a, r+1, c, fillColor, prevColor);
        fillMatrixColor(a, r, c+1, fillColor, prevColor);
    }

}
