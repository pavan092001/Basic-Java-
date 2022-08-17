package Array;

import java.util.Scanner;

public class Sumof1dArray {
    public static void main(String[] args) {
        //Given an array nums.
        // We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = in.nextInt();

        }
        int i = 0;
        int sum = 0;
        while(i<nums.length){
             sum = sum+nums[i];
             nums[i] = sum;
             i++;

        }
        for (int k:nums) {
            System.out.println(k);

        }
    }
}
