package BasicSynatx;

public class Average extends Sc {
    public static void main(String[] args) {
        int n = in.nextInt();
        int i = 0;
        double num1=0;
        double sum = 0;

        while(i<n){
            num1 = in.nextInt();
            sum+=num1;
            num1=sum;
            i++;
        }
        double result =(double) (num1/n);
        System.out.println("the average of "+n+" natural number is "+result);

    }
}
