package Sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] n = {3,0,1};
        System.out.println(missingNumber(n));
        System.out.println(Arrays.toString(n));

    }
    public  static int missingNumber(int[] nums) {
        int x = nums.length;
        for(int i =0;i<x;i++){
            int end = x-i-1;
            int max = findMax(end,nums);
            swap(max,end,nums);
        }

        for(int i =0;i<=nums[x-1];i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return 0;
    }
    static int findMax(int end,int[] p){
        int max =0;
        for(int i =0;i<=end;i++){
            if(p[max]<p[i])
                max = i;
        }
        return max;
    }
    static void swap(int start,int end,int[] p){
        int temp = p[start];
        p[start] = p[end];
        p[end] = temp;
    }
}
