package Sorting;

public class ContainDuplicate {

    public static void main(String[] args) {
        int[] n = {-2,-89,2,0,0};
        System.out.println(containsDuplicate(n));
    }
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        int temp;
        for(int i = 0;i<n-1;i++){
            for( int j = i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        for(int i =0;i<n-1;i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
