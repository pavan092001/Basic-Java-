package BasicSynatx;

public class Distance extends Sc{
    public static void main(String[] args) {
        System.out.println("ENTER THE  co ordinate of point one");
        double x1= in.nextDouble();
        double y1= in.nextDouble();
        double x2= in.nextDouble();
        double y2= in.nextDouble();
        double result = ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("the distance is "+sqrt(result));

    }
    static double sqrt(double result){
        double n = result/2;
        double t;
        do {
            t =n;
            n = (t+(result/t))/2;
        }while ((t-n)!=0);
        System.out.println(n);
        return n;


    }
}
