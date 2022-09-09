package Array;

public class letcode24 {


    /*Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).*/


    public static void main(String[] args) {

        int[]  n ={5,0,1,2,3,4};
        int[] ans = new int[n.length];


        for (int i = 0; i <n.length ; i++) {
            ans[i] = n[n[i]];
        }

        for (int k :ans) {
            System.out.print(k+" ");

        }

    }
}
