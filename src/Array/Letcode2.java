package Array;

import java.util.Scanner;

public class Letcode2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = 2;
        int[][] person = new int[3][3];
        for (int i = 0; i <person.length ; i++) {
            for (int j = 0; j <3; j++) {
                person[i][j] = in.nextInt();
            }
        }

//        for (int i = 0; i <person.length ; i++) {
//            for (int j = 0; j <3; j++) {
//                System.out.print(person[i][j]);
//            }
//            System.out.println("");
//        }


        int great = 0;
        for (int i = 0; i < person.length ; i++) {
            int sum = 0;
            for (int j = 0; j <person[i].length; j++) {
                int a = person[i][j];
                sum = sum +a;
            }
            great = Math.max(great, sum);
        }

        System.out.println(great);
    }
}
