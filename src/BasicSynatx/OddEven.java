package BasicSynatx;

import java.util.Scanner;

public class OddEven {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num == 0  ){
            System.out.println("the given number is 0 which is not even nor odd ");
        }
        else {
            int result = num % 2;
            switch (result){
                case 0 -> System.out.println("The given number is even");
                default -> System.out.println("the given numbr is odd");
            }

        }

    }
}
