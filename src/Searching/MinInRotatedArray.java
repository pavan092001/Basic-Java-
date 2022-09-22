package Searching;

public class MinInRotatedArray {
    public static void main(String[] args) {



    }
    static int min(int[] arr){
        int start = 0;
        int end = arr.length;
        while(start<end){
            int mid = start +(end-start)/2;
            if(end>mid && arr[mid]>arr[mid+1])
                return arr[mid+1];
            else if (start < mid && arr[mid]<arr[mid-1]) {
                return arr[mid];
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(start<end && arr[start]>arr[start+1]){

                }
            }

        }
        return  0;
    }
}
