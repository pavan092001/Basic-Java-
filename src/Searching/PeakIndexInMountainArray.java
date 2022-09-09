package Searching;

public class PeakIndexInMountainArray {

    /*852. Peak Index in a Mountain Array*/
    public static void main(String[] args) {
        int[] n = {1,3,5,7,10,8,6,4};



        int start = 0;
        int end = n.length-1;


        while (start<end){
            int mid = start +(end-start)/2;
            if (n[mid]<n[mid+1]){
                //increasing part of array
                start = mid+1;
            }else if(n[mid]>n[mid+1]){
                //decreasing part of array
                end = mid;
            }
        }
        System.out.println(end);
    }
}
