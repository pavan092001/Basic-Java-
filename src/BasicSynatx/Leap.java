package BasicSynatx;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        //Input a year and find whether it is a leap year or not.
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        CheckLeap(year);

        in.close();
    }
    static void CheckLeap(int y ){
        switch (y%100){
            case 0 -> {
                System.out.println("the gievn year is centuary year ");
                switch (y%400){
                    case 0 -> System.out.println("the year is leap");
                    default -> System.out.println("the year is not leap");
                }
            }
            default -> {
                if(y%4==0){
                    System.out.println("leap year");
                }
                else
                    System.out.println("non leap year");
            }

        }
    }
}
