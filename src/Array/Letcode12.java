package Array;

import java.util.Arrays;

public class Letcode12 {
    /* Given an n x n binary matrix image, flip the image horizontally,
    then invert it, and return the resulting image.
     To flip an image horizontally means that each row of the image is reversed.*/

    public static void main(String[] args) {
        int[][] im = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for (int i = 0; i < im.length ; i++) {
            int k = im.length-1;
            for (int j = 0; j <=k ; j++) {
                int temp = im[i][j];
                im[i][j] = im[i][k];
                im[i][k] = temp;
                k--;
            }

        }
//        for (int[] num:im) {
//            System.out.println(Arrays.toString(num));
//        }
//        for (int i = 0; i <im.length ; i++) {
//            for (int j = 0; j <im[i].length ; j++) {
//                im[i][j]=(im[i][j] == 0)?1:0;
//            }
//
//        }
        for (int[] num:im) {
            System.out.println(Arrays.toString(num));
        }

    }




}
