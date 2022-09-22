package Sorting;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] n = {-1,-2,-3,4,8,9};
        System.out.println(maximumProduct(n));

    }
    public  static int maximumProduct(int[] nums) {
//        int i,j,temp;
//        int n = nums.length;
//        int min1 = getMin(nums);
//        int min2 =getMin(nums,min1);
//        int max = getMax(nums);
//        if(min1<0 && min2<0){
//            if (max<0) {
//                min1 = getMax(nums, max);
//                min2 = getMax(nums, min1);
//                return min1*min2*max;
//            }
//        }else{
//            min1 = getMax(nums,max);
//            min2 = getMax(nums,min1);
//        }
//        return min1*min2*max;
//    }
//    static int getMin(int[] nums){
//        int min = nums[0];
//        for (int i = 0; i < nums.length ; i++) {
//            if(nums[i]<min)
//                min = nums[i];
//        }
//        return min;
//    }
//    static int getMin(int[] nums,int n1){
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length ; i++) {
//            if(nums[i]<min && nums[i]>n1)
//                min = nums[i];
//        }
//        return min;
//
//    }
//    static int getMax(int[] nums,int n1){
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length ; i++) {
//            if(nums[i]>max && nums[i]<n1)
//                max = nums[i];
//        }
//        return max;
//
//    }
//    static int getMax(int[] nums){
//        int max = nums[0];
//        for (int i = 0; i < nums.length ; i++) {
//            if(nums[i]>max)
//                max = nums[i];
//        }
//        return max;
//    }
//    static boolean identifyPositive(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]>=0)
//                return true;
//        }
//        return false;
//    }

        Arrays.sort(nums);
        int n = nums.length;
        int result = Math.max(nums[0]*nums[1]*nums[2],nums[n-1]*nums[n-2]*nums[n-3]);
        return Math.max(result,nums[0]*nums[1]*nums[n-1]);
    }

}
