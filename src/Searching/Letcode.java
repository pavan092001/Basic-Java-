package Searching;

import java.util.ArrayList;

public class Letcode {

    /*Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.*/
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int target = 5;
        System.out.println(findKthPositive(a,target));

    }

    public static int findKthPositive(int[] arr, int k) {
        int i =1;
        int j = 0;
        int n =arr[arr.length-1];
        ArrayList<Integer> l = new ArrayList<>();
       while(i<=n){
           if(i == arr[j]){
               i++;
               j++;
           }else {
               l.add(i);
               i++;
           }
       }
       return l.get(k-1);
    }
}

