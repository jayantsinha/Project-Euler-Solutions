/** 
 * Project Euler #11 solution
 *
 * by Jayant Sinha
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class P11 {

    public static void main(String[] a) throws Exception {
        File file = new File("grid.dat");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str[][] = new String[20][20];
        int grid[][] = new int[20][20];
        for (int i = 0; i < 20; i++) {
            str[i] = br.readLine().split(" ");
            for (int j = 0; j < 20; j++) {
                grid[i][j] = Integer.parseInt(str[i][j]);
            }
        }
        System.out.println("Grid Assigned.");
        int row = 20, col = 20, token = 4;
        long prod[] = new long[900];
        int pv=0, ph=0, pd=0;
        long maxprod = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < (col - token + 1); j++) {
                pv = Math.max(grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3],grid[j][i] * grid[j + 1][i] * grid[j + 2][i] * grid[j + 3][i]);
                if (i<row-token) {
                    pd = Math.max(grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3],grid[i][j+3] * grid[i+1][j+2] * grid[i+2][j+1] * grid[i+3][j]);
                }
                maxprod = Math.max(pv, Math.max(maxprod, pd));
            }
        }
        System.out.println(maxprod);
    }
}
