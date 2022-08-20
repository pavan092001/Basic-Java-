package Array;

import java.util.Arrays;

public class Letcode18 {

    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
      You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.*/
    public static void main(String[] args) {
        int[] nums ={3,2,3};
        int t = 6;
        byte[] result = new byte[2];
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int add = nums[i]+nums[j];
                if (add == t) {
                    result[0] = (byte) i;
                    result[1] =(byte) (j);
                }

            }


        }
        System.out.println(Arrays.toString(result));
    }
}
