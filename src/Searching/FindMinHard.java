package Searching;

public class FindMinHard {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{1,1,3,1}));

    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(end==0)
            return nums[0];
        if(nums[0]<nums[end])
            return nums[0];
        int mid;
        while(start<=end){
            mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return nums[mid+1];
            else if(start<mid && nums[mid]<nums[mid-1])
                return nums[mid];
            else if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                if(start<end && nums[start]>nums[start+1]){
                    return nums[start+1];
                }
                start++;
                if(end >start && nums[end]<nums[end-1])
                    return nums[end];
                end--;
            }else if(nums[start]<nums[mid] || (nums[start]== nums[mid] && nums[mid]>nums[end])){
                start =mid+1;
            }else
                end = mid-1;
        }
        return nums[0];
    }
}
