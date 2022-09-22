package Sorting;

import java.util.Arrays;

public class SelectionSortPractice {
    public static void main(String[] args) {
        int[] n = {1,2,3,89,54};

        for (int i = 0; i <n.length ; i++) {
            int end = n.length-i-1;
            int max = getMax(n,0,end);
            swap(n,max,end);
        }
        System.out.println(Arrays.toString(n));
    }
    static void swap(int[] n,int num1,int num2){
        int temp = n[num1];
        n[num1] = n[num2];
        n[num2] = temp;
    }
    static int getMax(int[] arr,int start,int end){
        int max = start;
        for (int i = 0; i <end; i++) {
            if(arr[max]<arr[i]) {
                max = i;
            }

        }
        return  max;
    }
}
