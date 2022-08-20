package Array;

import java.util.ArrayList;
import java.util.List;

public class Letcode16 {


    /*The array-form of an integer num is an array representing its digits in left to right order.
    For example, for num = 1321, the array form is [1,3,2,1].
    Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k*/


    public static void main(String[] args) {
        int[] n ={9,9,9,9,9,9,9,9,9,9};
        int c=1;
         int k =1;
         int p =k;
        int i = n.length;
        List <Integer> l = new ArrayList<>();
        while(--i>=0 || p>0){
            if (i>=0)
                p=p+ n[i];
            l.add(p%10);
            p=p/10;


        }
        int j = l.size()-1;
        for(i=0;i<=j;i++){
            int temp =l.get(i);
            l.set(i,l.get(j));
            l.set(j,temp);
            j--;
        }
        System.out.println(l);
    }
}
