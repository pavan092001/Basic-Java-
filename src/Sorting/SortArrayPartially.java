package Sorting;

import java.util.Arrays;

public class SortArrayPartially {
    public static void main(String[] args) {
        int[] n = {3,1,4,2};
        sortArrayByParityII(n);


    }
    public static int sortArrayByParity(int[] nums) {
        int n = nums.length;
        int temp;
        if(n == 0 || n == 1)
            return 0;
        int k = n-1;
        for(int i = 0;i<n;i++){
            if(nums[i]%2==0){
                for(int j =0;j<n;j++){
                    if(nums[j]%2!=0){
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return -1;
    }
    public static void sortArrayByParityII(int[] nums) {
         int i =0;
        int temp;
        int n = nums.length;
        int k =0;
        int j =0;
         while(i<n){
             if(nums[i]%2==0){
                 if(i%2==0){
                     i++;
                     continue;
                 }

                  j =0;
                  k =0;
                 while(k<n){
                     if(nums[k]%2!=0){
                         temp = nums[i];
                         nums[i] = nums[k];
                         nums[k] = temp;
                         break;
                     }
                     j++;
                     k = 2*j;
                 }
             }else{
                 if(i%2!=0){
                     i++;
                     continue;
                 }
                 j =0;
                 k =1;
                 while(k<n){
                     if(nums[k]%2!=0){
                         temp = nums[i];
                         nums[i] = nums[k];
                         nums[k] = temp;
                         break;
                     }
                     j++;
                     k = (2*j)+1;
                 }
             }
             i++;
         }
        System.out.println(Arrays.toString(nums));

    }
}
