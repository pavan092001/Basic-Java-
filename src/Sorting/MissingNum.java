package Sorting;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] n = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(n));

    }
    public  static int missingNumber(int[] nums) {
        int x = nums.length;
        int i =0;
        while(i<x){
            if(nums[i]<x  && i!=nums[i])
                swap(i,nums[i],nums);
            else
                i++;
        }

        i =0;
        while(i<x){
            if(i!=nums[i])
                return i;
            else
                i++;
        }
        return x;

    }

     static void swap(int start,int end,int[] p){
        int temp = p[start];
        p[start] = p[end];
        p[end] = temp;
    }
}
