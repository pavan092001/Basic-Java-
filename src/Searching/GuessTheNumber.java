package Searching;

import java.util.Scanner;

public class GuessTheNumber {

    /*We are playing the Guess Game. The game is as follows:
    I pick a number from 1 to n. You have to guess which number I picked.
    Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
    You call a pre-defined API int guess(int num), which returns three possible results:
    -1: Your guess is higher than the number I picked (i.e. num > pick).
    1: Your guess is lower than the number I picked (i.e. num < pick).
    0: your guess is equal to the number I picked (i.e. num == pick).

Return the number that I picked.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 500;
        int guess;
        while(true){
            guess =in.nextInt();
            if (guess==num) {
                System.out.println("0");
                break;
            } else if (guess>num) {
                System.out.println("the guess is higher");

            }else
                System.out.println("the guess is lower");


        }

    }
}
