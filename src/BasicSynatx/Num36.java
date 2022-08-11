package BasicSynatx;

public class Num36 extends Sc {

//    36.	Subtract the Product and Sum of Digits of an Integer
public static void main(String[] args) {
    int n = in.nextInt();
    int temp = 0;
    int add = add(n,temp);
    int mul = multi(n);
    int result = mul - add;
    System.out.println("the sum is "+add);
    System.out.println("the multiplication is "+mul);
    System.out.println("the subtraction of product and sum is "+result);
    in.close();


}
static  int add(int n, int b ){
    int re = 0;
    while(n>0){
        re= n%10;
        re = re+b;
        b = re;
        n=n/10;

    }
    return b;
}
    static int multi(int n){
    int b = 1;
    int re = 0;
    while (n>0){
        re = n%10;
        re = re *b;
        b =re;
        n/=10;
    }
    return  b;
    }


}
