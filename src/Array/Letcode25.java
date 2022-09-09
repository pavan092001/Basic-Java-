package Array;

import java.util.ArrayList;
import java.util.List;

public class Letcode25 {
    /*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant
    to least significant in left-to-right order. The large integer does not contain any leading 0's.Increment the large integer by one and return the resulting array of digits.*/
    public static void main(String[] args) {
        int[] m = {1,2,3};
        int i = 0;
        int c = m.length-1;
        int num =0;
        int p;
        int k =1;
       while (c-1>=0){
           k= k*10;
           c--;
       }
        System.out.println(k);
       while (i<m.length){
           num = num +m[i]*k;
           k/=10;
           i++;
       }
       num+=1;
       System.out.println(num);
        while (c-1>=0){
            k= k*10;
            c--;
        }
        k = num;
        while(k>0){


        }




    }
}
