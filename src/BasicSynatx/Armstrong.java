package BasicSynatx;

public class Armstrong extends Sc {


    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            isArmstrong(i);

        }
    }

    static void isArmstrong(int n) {
        int i =0;
        int a =n ;
        int reminder;

        while (n>0){
            reminder = n%10;
            i = i +reminder*reminder*reminder;
            n = n/10;
        }
        if (a==i)
            System.out.println(i);

    }
}
