package Sorting;


public class ThirdMaximum {
    public static void main(String[] args) {
        int[] n = {3,2};
        int x = thirdMax(n);
        System.out.println(x);
    }
    public static int thirdMax(int[] n) {
        int x = n.length;
        int end =0;
        int max=0;
        int p =-1;
        boolean s = false;
        for (int i = 0; i <x; i++) {
             end = x-i-1;
             max = getMax(n,0,end);
             int temp = n[max];
             n[max] = n[end];
             n[end] = temp;
             if(i == 0){
                 p++;
             } else if (n[end]!=n[end+1]) {
                 p++;
                 if(p == 2)
                     return n[end];
             }
        }
        return n[x-1];

    }
    static int getMax(int[] arr,int start,int end){
        int max = start;

        for (int i = 0; i <=end; i++) {
            if(arr[max]<arr[i]) {
                max = i;
            }

        }
        return max;
    }
}
