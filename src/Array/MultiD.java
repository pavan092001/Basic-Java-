package Array;

import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
        int rows = 3;
        int column = 3;
        Scanner in = new Scanner(System.in);
        int[][] a = new int[rows][column];
        for (int i = 0; i <rows ; i++) {
            for(int j =0; j<column;j++){
                a[i][j] = in.nextInt();
            }
        }
        int[] n = new int[rows];



    }
}
