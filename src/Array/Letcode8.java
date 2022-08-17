package Array;

import java.util.Arrays;

public class Letcode8 {

    public static void main(String[] args) {

//        Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//    Initially target array is empty.
//    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//    Repeat the previous step until there are no elements to read in nums and index.
//
//Return the target array.
//
//It is guaranteed that the insertion operations will be valid.
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int [] ans = new int[nums.length];

        for (int i = 0; i <index.length; i++) {
            ans[nums[i]] = index[i];
            ans[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(ans));

    }
}
