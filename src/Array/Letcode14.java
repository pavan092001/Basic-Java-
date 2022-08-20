package Array;

public class Letcode14 {

    /* Given an array nums of integers, return how many of them contain an even number of digits.*/
    public static void main(String[] args) {
        int[] a = {555,901,482,1771};
        int re =0;
        for (int i = 0; i <a.length ; i++) {
            int num =0;
            while (a[i]>0){
                a[i]/=10;
                num++;
            }
            if (num%2==0){
                re++;
            }

        }
        System.out.println(re);
    }
}
