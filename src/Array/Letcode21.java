package Array;

import java.util.ArrayList;
import java.util.List;

public class Letcode21 {


    /*Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
     A lucky number is an element of the matrix such that it is the minimum element in its row and maximum
     in its column.*/


    public static void main(String[] args) {
        int[][] c={
                {3,7,8},{9,11,13},{15,16,17}
        };
        int max1 =Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        List<Integer> p = new ArrayList<>();


        for (int i = 0; i <c.length ; i++) {
            for (int j = 0; j < c[i].length ; j++) {
                if (max1>c[i][j]){
                    max1 = c[i][j];
                }


            }


        }
        System.out.println(p);
    }
}
