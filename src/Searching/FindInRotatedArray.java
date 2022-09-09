package Searching;

public class FindInRotatedArray {

    //find the number in rotated array
    public static void main(String[] args) {
        int[] a ={4,5,6,7,8,1,2};
        int target = 4;
        int pivit = pivit(a);
        int result = search(a,target,0,pivit);

        if (result == -1)
            result = search(a,target,pivit+1,a.length-1);
        System.out.println(result);


    }
    static  int pivit(int[] arr){
        int start= 0;
        int end = arr.length;
        int mid;
        int pivit = 0;


        while (start<=end){
            mid = start+(end-start)/2;
            int x = arr[mid];

            if (mid<end && x>arr[mid+1]){
                pivit = mid;
                break;
            } else if (mid  > start && x<arr[mid-1]) {
                pivit = mid -1;
                break;
            }else if (arr[mid]<=arr[start])
                end =mid-1;
            else
                start =mid+1;
        }
        return  pivit;
    }
    static int search(int[] arr,int target,int start,int end){
        int mid =0;
        while(start<=end){
            mid= start+(end-start)/2;
            if (target == arr[mid])
                return mid;
            else if(target<arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }
}
