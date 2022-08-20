package Array;

import java.util.Arrays;

public class Letcode15 {

    /* Given a 2D integer array matrix, return the transpose of matrix.
     The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.*/

    public static void main(String[] args) {
        int[][] in = {
                {1,2,3},
                {4,5,6}
        };

        int[][]  n = new int[in[0].length][in.length];
        for (int i =0; i< in.length;i++){
            for (int j = 0; j <n.length; j++) {
                n[j][i] = in[i][j];
            }
        }

//        for (int i = 0; i <in.length ; i++) {
//            for (int j = 0; j <in.length ; j++) {
//                if (j>i){
//                    int temp = in[i][j];
//                    in[i][j] = in[j][i];
//                    in[j][i] = temp;
//                }
//            }
//        }
        for (int[] num:n) {
            System.out.println(Arrays.toString(num));

        }
    }
}
