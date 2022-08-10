package BasicSynatx;

public class Palindrome extends Sc{
    public static void main(String[] args) {
        String n = in.next();
        String reverse="";
        for (int i =n.length()-1;i>=0;i--){
            reverse = reverse+n.charAt(i);
        }
        System.out.println(reverse);
        if (n.equals(reverse)){
            System.out.println("Palindrone");
        }
        else{
            System.out.println("not palidrone");
        }






    }

}
