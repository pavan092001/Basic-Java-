package Array;

import java.util.Arrays;

public class Letcode19 {
    /*
    * Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
    The value of |x| is defined as:
    x if x >= 0.
    -x if x < 0.
     */
    public static void main(String[] args) {
        int n = 3;
        int[] v = new int[n];
        for(int i=0;i<n;i++)
            v[i]= 2*i - n + 1;
        System.out.println(Arrays.toString(v));







    }
}
