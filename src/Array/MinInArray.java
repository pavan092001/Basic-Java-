package Array;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        int min = min(arr);
        System.out.println(min);
        System.out.println(max(arr));
    }
    static int min(int[] arr){
        int min =arr[0];
        for (int num:arr) {
            if (num<min){
                min = num;
            }
        }
        return  min;
    }
    static int max(int[] arr){
        int max =arr[0];
        for (int num:arr) {
            if (num>max){
                max = num;
            }
        }
        return  max;
    }
}
