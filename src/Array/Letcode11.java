package Array;

import java.util.Arrays;

public class Letcode11 {


    /* There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
    The biker starts his trip on point 0 with altitude equal 0.

      You are given an integer array gain of length n where gain[i] is the net gain in altitude between points
      and i + 1 for all (0 <= i < n). Return the highest altitude of a point.*/


    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int[] alt = new int[gain.length+1];
        alt[0]=0;
        for (int i = 0; i < gain.length ; i++) {
            alt[i+1]= alt[i]+gain[i];
        }
        System.out.println(Arrays.toString(alt));
        int high =0;
        for (int i = 0; i < alt.length; i++) {
            if (high<alt[i])
                high = alt[i];
        }
        System.out.println(high);
    }
}
