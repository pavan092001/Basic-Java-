package BasicSynatx;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        /*  here you have to accept the name and print the gretting msg the number of time  the number of letter are in name*/

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
        int l = name.length();
        for(int i =0;i<l;i++){
            System.out.println("Good Mornning");
        }
        in.close();

    }
}
