package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] n = {5,4,3,2,8,1,6,7};
        int i = 0;
        while(i<n.length) {
            int correct = n[i] -1;
            if(i!=correct){
                int temp = n[i];
                n[i] = n[correct];
                n[correct] = temp;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
