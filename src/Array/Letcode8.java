package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int [] ans = new int[nums.length];
        ArrayList<Integer> n = new ArrayList<>(nums.length);


        for (int i = 0; i < index.length ; i++) {
            n.add(index[i],nums[i]);
        }
        System.out.println(n);



    }
}
