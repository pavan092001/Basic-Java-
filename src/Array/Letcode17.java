package Array;

import java.util.Arrays;

public class Letcode17 {
    //You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
    //The population of some year x is the number of people alive during that year.
    // The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.


    public static void main(String[] args) {
        int[][] mat ={
                {0,1},
                {1,1}
        };
        int [][] target ={
                {1,0},
                {0,1}
        };
        System.out.println(findRotation(mat,target));

//        for (int[] num:p) {
//            System.out.println(Arrays.toString(num));
//        }

    }

//    static void transpose(int[][] p){
//        for (int i = 0; i <p.length; i++) {
//            for (int j = 0; j<p[i].length; j++) {
//                if (i < j){
//                    int temp = p[i][j];
//                    p[i][j] = p[j][i];
//                    p[j][i] = temp;
//
//                }
//            }
//        }
//
//
//    }
//    static  void rotate(int[][] p){
//        for (int i = 0; i< p.length ; i++) {
//            int k = 0;
//            for (int j = p.length-1; k<=j; j--) {
//                int temp = p[i][k];
//                 p[i][k] =p[i][j];
//                 p[i][j] = temp;
//                 k++;
//            }
//
//        }
//    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n =0;
        int p = mat.length;
        int k =p*p;
        for( int i=0;i< p;i++){
            for( int j=0;j<p;j++){
                if(mat[i][j] == target[i][j]){
                    n++;
                }
            }
        }
        if (n==p*p){
            return true;
        }
        n=0;
        while(n<3){
            int c = rotate(mat,target);
            if(c==k)
                return true;
            n++;
        }
        return false;


    }

    static int rotate(int[][] mat,int[][] target){
        int i,j,temp,k;
        int z = mat.length;
        for( i =0; i<z;i++){
            for( j = 0;j<z;j++){
                if(i<j){
                    temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        for(i=0;i<z;i++){
            k=0;
            for(j=z-1;k<=j;j--){
                temp = mat[i][k];
                mat[i][k] = mat[i][j];
                mat[i][j] = temp;
                k++;
            }
        }
        k=0;
        for(i=0;i<z;i++){
            for(j=0;j<z;j++){
                if(mat[i][j] == target[i][j]){
                    k++;
                }
            }
        }
        return k;

    }


}
