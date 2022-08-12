package BasicSynatx;

public class Marks  extends Sc{
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100).
        // Define a method that will display grades according to the marks entered as below:
        System.out.println("enter the marks ");
        double marks = in.nextDouble();

        if (isBetwen(marks,91,100)){
            System.out.println("A");
        }else if (isBetwen(marks,81,90)){
            System.out.println("B");
        }else if(isBetwen(marks,71,80)){
            System.out.println("C");
        }else if (isBetwen(marks,61,70)){
            System.out.println("D");
        } else if (isBetwen(marks,51,60)) {
            System.out.println("D");
        }else if (isBetwen(marks,41,50)){
            System.out.println("E");
        }else
            System.out.println("Fail");
    }
    static boolean isBetwen(double n, int a , int b){
        return a<=n && n<=b ;
    }
}
