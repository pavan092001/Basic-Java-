package Searching;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));

    }
    public static int mySqrt(int x) {
        int end = x;
        int start = 0;
        int mid;
        long c;
        while(start<=end){
            mid = start+(end- start)/2;
            c = (long) mid *mid;
            if(c== x)
                return mid;
            else if(c <x){
                if((long) (mid + 1) *(mid+1)>x)
                    return mid;
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return 0;
    }
    public static boolean isPerfectSquare(int num) {
        if(num ==1)
            return true;
        int start = 2;
        int end = num/2;
        int mid;
        int c;
        while(start<=end){
            mid = start+(end-start)/2;
            c = (int) mid *mid;
            if(c == num)
                return true;
            else if(c>num)
                end = mid-1;
            else
                start = mid+1;
        }
        return false;
    }
}
