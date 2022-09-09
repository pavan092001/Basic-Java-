package Searching;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args) {
        int[] n = {2,3,4,7,11};
        System.out.println(findKthPositive(n,3));
    }
    public static int findKthPositive(int[] arr, int k) {
        int end = arr[arr.length-1];
        int start = 1;
        int j = 0;
        List<Integer> p  = new ArrayList<>();
       for(int i = 1;i<end;i++){
           if(arr[j] ==i){
               i++;
               j++;
             continue;
           }
           p.add(i);
           i++;
       }
       return p.get(k);
    }
}
