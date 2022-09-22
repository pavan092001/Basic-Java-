package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] q = intersection2(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(q));

    }
    public  static int[] intersection(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        ArrayList<Integer> p = new ArrayList<>(10);
        boolean t = false;

        for(int i = 0;i<b;i++){
            for(int j = 0; j<a;j++){
                if(nums2[i] == nums1[j]){
                    t = true;
                    p.add(nums2[i]);
                    break;
                }
            }
        }
        int[] arr = new int[p.size()];
        for(int i =0;i<arr.length;i++){
            arr[i] = p.get(i);
        }
        return arr;

    }
    public  static int[] intersection2(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        ArrayList<Integer> p = new ArrayList<>(10);

        if(b<a) {
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    if (nums2[i] == nums1[j]) {
                        p.add(nums2[i]);
                        break;
                    }
                }
            }

        }else {
            for(int i = 0;i<a;i++){
                for (int j = 0; j<b; j++) {
                    if(nums2[j] == nums1[i]){
                        p.add(nums2[i]);
                        break;
                    }

                }
            }
        }
        int[] arr = new int[p.size()];
        for(int i =0;i<arr.length;i++){
            arr[i] = p.get(i);
        }
        return arr;

    }
}
