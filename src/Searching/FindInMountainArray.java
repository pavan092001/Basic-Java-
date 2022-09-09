package Searching;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,1};
        int target =2;
        int  s = 0;
        int e = arr.length-1;
        int p = findPeak(arr,s,e,target);
        System.out.println(p);

    }
    static int findPeak(int[] arr,int s,int e,int target){
        int mid;
        while (s<e){
            mid = s+(e-s)/2;
            if (arr[mid]<arr[mid+1]){
                //it's in assending part of array
                s = mid+1;
            }else
                e = mid;
        }
        return search(s,arr,target);
    }
    static int search(int end,int[] arr,int target){
        int result =Integer.MAX_VALUE;
        int start = 0;
        int mid = 0;
        int l = arr.length-1;
        int peak = end+1;
        while(start<=end){
            mid=start+(end-start)/2;
                if (arr[mid]>target){
                    end = mid-1;
                } else if (arr[mid]<target) {
                    start = mid+1;
                }else {
                    result = mid;
                    break;
                }

            }

        while (peak<=l){
            mid = peak+(l-peak)/2;
            if (arr[mid]<target)
                l = mid-1;
            else if (arr[mid]>target)
                peak = mid+1;
            else{
                result = Math.min(result, mid);
                break;
            }
        }
        return  result;
    }
}
