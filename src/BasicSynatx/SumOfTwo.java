package BasicSynatx;

import java.util.Scanner;

public class SumOfTwo extends Sc {
    public static void main(String[] args) {

        //2.	Take two numbers and print the sum of both
//        sum();
        table();

        // 3.	Take a number as input and print the multiplication table for it


    }
    static void sum(){
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1+num2);
    }
    static void table(){
        int num = in.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(num+" X " +i+" = "+num*i);
            i++;
        }
    }

}
