package BasicSynatx;

public class Fibonacci extends Sc {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers
        int n = in.nextInt();
        fib(n);
    }
    static void fib(int n){
        int num1=0;
        int num2=1;
        int n3;
        System.out.println(num1);
        System.out.println(num2);
        int i = 2;
        while (i<n){
            n3 = num2+num1;
            System.out.println(n3);
            num1 =num2;
            num2=n3;

            i++;
        }
    }
}
