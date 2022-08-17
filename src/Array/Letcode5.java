package Array;

import java.util.ArrayList;

public class Letcode5 {

    public static void main(String[] args) {
        //the letcode 4 problem solve using the  arraylist
        int[] candies ={1,1,5,6,3};
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        for (int i = 0; i <candies.length ; i++) {
            int extra = 4;
            extra = extra+candies[i];
            list.add(true);
            for (int j = 0; j < candies.length; j++) {
                if (extra<candies[j]){
                    list.set(i,false);
                    break;
                }else {
                    list.set(i,true);
                }
            }
        }
        System.out.println(list);


    }
}
