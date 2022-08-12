package BasicSynatx;

public class Largest extends Sc {
    //39.	Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        int num1;
        int num2 = 0;
        String s;
        while (true){
            s = in.next();
            if ((s.equals("x"))){
                System.out.println(num2);
                break;
            }
            num1=Integer.parseInt(s);
            num2=num1>num2?num1:num2;

        }
    }
}
