package Searching;

public class BinarySearch {

    /* simple binary search implement */


    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6,7,8,9,12,15,20,21,22,23,50,60,65,70,78,100,101,189,800};
        int start =0;
        int target = 80;
        int end = b.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if (b[mid]<target){
                start = mid+1;
            } else if (b[mid]>target) {
                end = mid -1;
            }
            else {
                System.out.println(mid);
                break;
            }
        }


    }
}
