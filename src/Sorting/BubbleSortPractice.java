package Sorting;

import java.util.Arrays;

public class BubbleSortPractice {

    public static void main(String[] args) {
        int[] p = { 1,3,4,5,98,4};
        int n = p.length;
        boolean s = false;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                 if(p[j]<p[j-1]) {
                     int temp = p[j];
                     p[j] = p[j - 1];
                     p[j - 1] = temp;
                     s = true;
                 }
            }
            if(!s)
                break;
            
        }
        System.out.println(Arrays.toString(p));
    }
    
}
