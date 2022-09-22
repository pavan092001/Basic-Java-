package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] n= {56,89,1,6,7};

        for (int i = 0; i <n.length-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(n[j]<n[j-1]){
                    int temp = n[j];
                    n[j] = n[j-1];
                    n[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
