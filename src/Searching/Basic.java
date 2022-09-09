package Searching;

public class Basic {

    public static void main(String[] args) {
        int target = 1894;
        int[] p = {89,46,56,5,65,565,7,45,8,1,541,5};
        for (int i = 0; i <p.length; i++) {
            if (p[i]==target){
                System.out.println(i);
            }

        }
    }
}
