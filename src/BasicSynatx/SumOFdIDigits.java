package BasicSynatx;

public class SumOFdIDigits extends Sc {
    public static void main(String[] args) {
        String num1;
        int num2;
        int num3 = 0;
        int p = add();
        System.out.println(p);
    }
    static int add(){
        int num2;
        int num3 =0;
        while (true){
             String num1 = in.next();
             if (num1.equals("x")){
                 break;
             }
             num2 = Integer.parseInt(num1);
             num3 = num3+num2;

        }
        return num3;
    }
}
