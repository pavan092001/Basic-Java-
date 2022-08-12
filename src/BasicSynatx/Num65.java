package BasicSynatx;

public class Num65 {
    public static void main(String[] args) {

        //65.	Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

      int n = 1;
      int choice = 0;
      while(n<31){
          if (n%2==0){
              choice++;
          }
          n++;
      }
      System.out.println(choice);
    }
}
