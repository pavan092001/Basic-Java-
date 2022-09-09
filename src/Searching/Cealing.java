package Searching;

public class Cealing {

    //find smallest number from array which is greater than or equal to the given number
    public static void main(String[] args) {
        int[] p = {1,5,7,8,10,15,25,30,39,47,85};
        int start = 0;
        int end = p.length-1;
        int target=10;
        int mid ;
        int result = -1;
        while(start<=end){
            mid = start+(end-start/2);

            if (p[mid]== target){
                result =mid;
                break;
            } else if (target<p[mid]) {
                end = mid -1;
            }else
                start = mid+1;
        }
        if(result == -1)
            result = start;


        System.out.println(result);


    }

}
