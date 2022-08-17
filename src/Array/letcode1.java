package Array;

import java.util.Arrays;
import java.util.Scanner;

public class letcode1 {

    public static void main(String[] args) {

        //Given an integer array nums of length n, you want to create an array ans of length 2n
        // where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int nb = arr.length;
        System.out.println(nb);

        int[] arr2 = new int[arr.length*2];
        int i = 0;
        while (i < 2 * n) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i] = arr[j];
                i++;

            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
