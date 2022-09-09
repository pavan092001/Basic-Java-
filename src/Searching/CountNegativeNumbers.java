package Searching;

public class CountNegativeNumbers {

    public static void main(String[] args) {
        int[][] n ={
                {3,2},
                {1,0}
        };
        System.out.println(countNegatives(n));

    }
    static  int countNegatives(int[][] m) {
        int i =0;
        int j ;
        boolean flag = false;
        int negative =0;

        while (i< m.length){
            flag =false;
            j = m[0].length-1;
            while (j>=0){
                if(m[i][j]>=0){
                    i++;
                    flag = true;
                    break;
                }
                j--;
                negative++;
            }
            if(!flag)
                i++;
        }
        return  negative;
    }
}
