package Array;

public class Letcode22 {


    /*In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
   you are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
   The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
    If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.*/

    public static void main(String[] args) {
        int[][] arr ={{1,2},{4,5}};
        int r=1;
        int c= 4;
        int i =0;
        int sum=0;
        int[][] result = new int[r][c];
        while(i< arr.length){
             sum = sum +arr[i].length;
             i++;
        }
        if (r*c== sum){
            for(i=0;i<r;i++){
                for(int j = 0;j<c;j++){

                }
            }
        }


    }

}
