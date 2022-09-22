package BasicSynatx;

import java.util.Arrays;

public class Gfg2 {

    public static void main(String[] args) {
        int[] p = greaterElement(new int[]{-10 ,- 1 ,- 14, 7 ,- 16, - 17 ,- 9},7);
        System.out.println(Arrays.toString(p));

    }
    public static int[] greaterElement (int arr[], int n) {
        // Complete the function
        int[] p = new int[n];
        boolean s ;
        int  temp = -100001;
        for(int i =0;i<n;i++){
            temp = 100001;
            s = false;
            for(int j =0;j<n;j++){
                if(arr[j]>arr[i] && arr[j]<temp){
                    p[i] = arr[j];
                    temp = arr[j];
                    s = true;
                }
            }
            if(!s){
                p[i] = -10000000 ;
            }
        }
        return p;
    }
}
