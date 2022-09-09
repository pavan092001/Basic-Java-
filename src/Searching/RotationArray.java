package Searching;

public class RotationArray {
    public static void main(String[] args) {
        int[] nums ={1};
        int target = 0;
        System.out.println(search(nums,target));

    }
    static boolean search(int[] nums, int target) {
        int end = nums.length-1;
        int p = findPivit(nums,end);
        boolean re = s(nums,target,0,p);
        if(re == false)
            return s(nums,target,p+1,end);
        return re;
    }
    static int findPivit(int[] nums,int end){
        int mid;
        int start = 0;
        while(start<=end){
            mid = start+(end-start)/2;

            if( mid<end && nums[mid]>nums[mid+1])
                return mid;
            else if (mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            else if(nums[mid]==nums[start] && nums[mid] == nums[end]){
                if( end>start && nums[start]>nums[start+1])
                    return start;
                start++;
                if( start<end && nums[end]<nums[end-1])
                    return end-1;
                end--;
            }else if(nums[start]<nums[mid] || (nums[start]== nums[mid] && nums[mid]>nums[end]))
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
     static boolean s(int[]  nums,int target,int start,int end){
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid]==target)
                return true;
            else if(nums[mid]>target)
                end =mid-1;
            else
                start = mid+1;
        }
        return false;
    }
}

