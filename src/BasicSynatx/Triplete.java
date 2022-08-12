package BasicSynatx;

public class Triplete extends Sc {
    public static void main(String[] args) {
       int num1 = in.nextInt();
       int num2 = in.nextInt();
       int num3 = in.nextInt();
        System.out.println("the given numbers are triplete is "+isTriplete(num2,num1,num3));

    }
    static boolean isTriplete(int a, int b ,int c){
        if (a>b){
            if (a>c){
                return (a*a==b*b+c*c);
            }else
                return (c*c==a*a+b*b);
        }else{
            if (b>c){
                return (b*b==a*a+c*c);
            }else
                return (c*c==a*a+b*b);
        }

    }

}
