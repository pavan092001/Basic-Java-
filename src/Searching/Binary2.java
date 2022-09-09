package Searching;

public class Binary2 {

    /*
    * order agnostic binary search (when we dont know the order of sorted array is it assending or decending*/
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6,7,8,9,12,15,20,21,22,23,50,60,65,70,78,100,101,189,800};
        int[] c ={800,700,700,600,450,89,56,56,45,35,34,22,10,8,6};
        int target = 700;
        int start = 0;
        int end = c.length-1;
        boolean isA = (c[end]>c[start]);
        while (start<=end){
            int mid = start +(end -start)/2;
            if (c[mid]==target){
                System.out.println(mid);
                break;
            }
             if (isA){
                if (c[mid]>target){
                    end = mid -1;
                }
                else
                    start = mid +1;
            }
             else {
                 if (c[mid]>target)
                     start = mid+1;
                 else
                     end = mid -1;
            }
        }
    }
}
