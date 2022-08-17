package Array;

import java.util.Arrays;

public class Letcode7 {
    //Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    // That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    //Return the answer in an array.

    public static void main(String[] args) {
        int[] nums= {8,1,2,2,3};
        int[] small= new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int smallnum =0;
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i]>nums[j]){
                    smallnum++;
                }
            }
            small[i] = smallnum;
        }
        System.out.println(Arrays.toString(small));
    }
}
