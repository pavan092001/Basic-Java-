package BasicSynatx;

public class Num66 extends Sc {
    public static void main(String[] args) {

        //66.	Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        int positiveeven = 0;
        int negative = 0;
        int positiveodd = 0;
        while (true){
            int num = in.nextInt();
            if (num == 0){
                break;
            }else if (num<0){
                negative+=num;
            }else {
                if (num%2==0){
                    positiveeven+=num;
                }
                else {
                    positiveodd+=num;
                }
            }
        }
        System.out.println(positiveeven);
        System.out.println(negative);
        System.out.println(positiveodd);



    }
}
