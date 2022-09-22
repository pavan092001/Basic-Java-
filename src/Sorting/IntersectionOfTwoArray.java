package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] n = {3,1,2};
        int[] m = {1,1};
        intersect(n,m);

    }
    public static void intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i <nums1.length ; i++) {
            while (j<nums2.length){
                if(nums1[i] == nums2[j]){
                    p.add(nums2[j]);
                    j++;
                    break;
                }else if(nums2[j]>nums1[i])
                    break;
                else
                    j++;

            }
        }
        System.out.println(p);

    }
}
