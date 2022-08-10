package BasicSynatx;

import static java.util.logging.Logger.global;

public class HcfLcm extends Sc{
    public static void main(String[] args) {
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int hcf =0;
        int final_hcf = hCF(num1,num2,hcf);
        int final_LCM =LCM(num1,num2);
        System.out.println("enter 1 for lcm" +
                "\nenter 2 for hcf " +
                "\nenter 3 for both");
        int choice = in.nextInt();
        switch (choice){
            case 1 ->System.out.println("the lcf of"+ num1 + " & "+num2+" is "+ final_LCM);
            case 2 -> System.out.println("the hcf of"+ num1 + " & "+num2+" is "+ final_hcf);
            case 3 ->
            { System.out.println("the hcf of"+ num1 + " & "+num2+" is "+ final_hcf);
                System.out.println("the lcf of"+ num1 + " & "+num2+" is "+ final_LCM);}

            default -> System.out.println("Make a valid choice");
        }

    }

    static int hCF(int a ,int b, int hcf){
         int snum = a>b?b:a;
         int i = 1;
         while(i<=snum){
             if (a%i==0 && b%i==0){
                 hcf = i;
             }
             i++;
         }
        return hcf;
    }
    static int LCM(int a,int b){
        int hcf= 0;
        int hCF = hCF(a,b,hcf);
        return (a /hCF) * b;


    }
}
