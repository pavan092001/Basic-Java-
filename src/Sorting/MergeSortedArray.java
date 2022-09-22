package Sorting;

import Array.Arr;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] num1 = {0};
        int[] num2 = {1};
        int m = 0;
        int n = 1;
        merge(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j =0;
        int p = m-1;
        if(m == 0){
            nums1 = nums2.clone();
            System.out.println(Arrays.toString(nums1));
            return;
        }
        if(n==0)
            return;
        while(i< n){
            while (j<m+n){
                if(nums2[i]<= nums1[j]){
                    pushForwad(nums1,j,m,n);
                    nums1[j] = nums2[i];
                    i++;
                    p++;
                    break;
                }
                if(nums2[i]>nums1[p]){
                    nums1[p+1] = nums2[i];
                    p++;
                    i++;
                    break;
                }
                j++;
            }

        }
    }
     static void pushForwad(int[] p,int s,int m,int n){
        int x = m+n-1;
        while(x>s){
            p[x] = p[x-1];
            x--;
        }
    }
}
