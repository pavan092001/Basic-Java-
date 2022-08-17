package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Letcode3 {
    public static void main(String[] args) {
        //Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
        //
        //Return the array in the form [x1,y1,x2,y2,...,xn,yn].
        Scanner in= new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[2*n];
        for (int i = 0; i <nums.length ; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
        int[] num2 = nums.clone();
        for (int i = 0; i <n; i++) {
            int y =2*i;
            num2[y]= nums[i];
            num2[y+1] =nums[n+i];
        }
        System.out.println(Arrays.toString(num2));
    }
}
