package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAllNumber {
    public static void main(String[] args) {
        int[] n ={1};
        List<Integer> p =  findDisappearedNumbers(n);
        System.out.println(p);


    }
    public  static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int x = nums.length;
        int i =0;
        int temp;
        int p;
        while(i<x){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else
                i++;
        }
        i =1;
        while(i<=x){
            if(i!=nums[i-1]){
                l.add(i);
            }
            i++;
        }
        return l;
    }
}
