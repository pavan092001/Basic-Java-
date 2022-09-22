package Array;

public class Letcode26 {
    //https://leetcode.com/problems/find-pivot-index/

    public static void main(String[] args) {
        int[] n = {2,1,-1};
        System.out.println(pivotIndex(n));

    }
    public static int pivotIndex(int[] nums) {
        int sum1 ;
        int sum2 ;
        for (int i = 0; i < nums.length ; i++) {
            int k = i-1;
            sum1 =0;
            sum2 =0;
            while(k>=0){
                sum1 = sum1 +nums[k];
                k--;
            }
             k = i+1;
            while(k< nums.length){
                sum2 = sum2 +nums[k];
                k++;
            }
            if(sum1 == sum2)
                return i;

        }
        return -1;
    }
}
