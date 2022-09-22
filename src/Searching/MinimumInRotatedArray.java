package Searching;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{22,45,99,10,15,20}));


    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<=end){
            mid= start+(end-start)/2;
            if(end>mid && nums[mid]>nums[mid+1])
                return nums[mid+1];
            else if(start<mid && nums[mid]<nums[mid-1])
                return nums[mid];
            else if(nums[start]<=nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return  -1;
    }
}
