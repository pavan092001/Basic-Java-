package BasicSynatx;

public class Factorial extends Sc{
    public static void main(String[] args) {
        //37.	Input a number and print all the factors of that number (use loops).
        System.out.println("enter the number");
        int n = in.nextInt();
        int i = 1;
        if (n != 0) {
            while (n > 0) {
                i *= n;
                n--;
            }
            System.out.println(i);
        }else {
            System.out.println("the entered nuber maybe negative or zero");
        }
        in.close();
    }
}
