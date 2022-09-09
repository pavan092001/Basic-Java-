package Array;

import java.util.Scanner;

public class Letcode23 {


    /*Given an integer n, return true if it is a power of three. Otherwise, return false.
    An integer n is a power of three, if there exists an integer x such that n == 3x.*/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//        int x = num/3;
//        if (num == x*3){
//            System.out.println("true "+num);
//        }
//        else
//            System.out.println("false "+num);
        int x =10;
        int c =1;
        int sum = 0;
        int p=0;
        int y = x;
        while(y>0){
            c=c*10;
            y/=10;
        }
        System.out.println(c);
        y=x;
        while(x>0){
            p= x%10;
            sum = sum+p*c;
            c/=10;
            x/=10;
        }
        System.out.println(y==sum);

    }
}
