package Searching;

import java.util.Arrays;

public class Letcode2 {
    public static void main(String[] args) {
        int[] n = {8,19,4,2,15,3};
        long startTime = System.currentTimeMillis();
        System.out.println(findFinalValue(n,2));
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }
    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int t = original;
        while (t<=nums[nums.length-1]){
            t = search(nums,t);
            if(t==original || t*2>nums[nums.length-1])
                break;
        }
        return t;


    }
    static int search(int[] nums,int t){
        int start =0;
        int mid =0;
        int end = nums.length-1;
        while(start<=end){
            mid = start+(end-start)/2;
            if(t == nums[mid]){
                t=t*2;
                return t;
            }else if(nums[mid]>t)
                end = mid-1;
            else
                start =mid+1;
        }
        return t;
    }
}

