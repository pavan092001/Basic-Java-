package BasicSynatx;

import java.util.Arrays;

public class DayOf {
    public static void main(String[] args) {
        int[] p = daysOfWeeks(46860468 ,5);
        System.out.println(Arrays.toString(p));

    }
    static int[] daysOfWeeks(int N , int K) {
        // code here
        int p = N/7;
        int[] days = {p,p,p,p,p,p,p};
        // for(int i =0;i<7;i++){
        //     days[i] = p;
        // }
        p = 1;
        int c = N%7;
        while(p<=c){
            if(K>7)
                K=1;
            days[K-1] = days[K-1]+1;
            K++;
            p++;
        }
        return days;
    }
}
