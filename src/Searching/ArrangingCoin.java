package Searching;

public class ArrangingCoin {

    public static void main(String[] args) {

      System.out.println(arrangeCoins(2147483647));

    }
    static int arrangeCoins(int n) {
        int start=1;
        int end = n;
        int mid;
        long sum;
        while (start<=end){
            mid = start+(end-start)/2;
            sum =((long) mid *(mid+1)/2);
            if(sum>n){
                end =  (mid-1);
            } else if (sum<n) {
                start = mid+1;
            }
            else
                return mid;
        }
        return start-1;

    }

}
//

