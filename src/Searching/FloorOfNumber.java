package Searching;

public class FloorOfNumber {

    /*  find greatest  number from array which is smalller than or equal to the given number*/
    public static void main(String[] args) {
        int[] p = {1,5,7,8,10,15,25,30,39,47,85};
        int start =0;
        int end = p.length-1;
        int result = -1;
        int mid ;
        int target = 9;
        while(start<=end){
            mid = start+(end-start)/2;
            if (p[mid]== target){
                result = p[mid];
                break;
            } else if (p[mid]>target) {
                end = mid -1;
            }else
                start = mid +1;
        }
        if (result == -1)
            result =p[end];

        System.out.println(result);

    }
}
