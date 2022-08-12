package BasicSynatx;

public class Cnumber  extends  Sc{
    public static void main(String[] args) {
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(greatest(num1,num2,num3));
        System.out.println(smallest(num1,num2,num3));

    }
    static int greatest(int a,int b,int c){
        int great= 0;
        if (a>=b){
            if (a>c)
                great=a;
            else
                great=c;
        }
        else {
            if(b>c)
                great = b;
            else
                great=c;
        }
        return great;
    }

        static  int smallest(int a, int b, int c){
            int small = 0;
            if (a<b){
                if (a<c)
                    small =a;
                else
                    small  = c;
            }
            else {
                if (c>b)
                    small = b;
                else
                    small = c;
            }
            return small;
    }
}
