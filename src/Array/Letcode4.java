package Array;

import java.util.Arrays;

public class Letcode4 {


    public static void main(String[] args) {
        //question number 1431  in letcode
        //There are n kids with candies. You are given an integer array candies,
        // where each candies[i] represents the number of candies the ith kid has,
        // and an integer extraCandies, denoting the number of extra candies that you have.
        //Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
        // they will have the greatest number of candies among all the kids, or false otherwise.
        //Note that multiple kids can have the greatest number of candies.
        int[] candies ={1,1,5,6,3};
        boolean[] result = new boolean[candies.length];
        System.out.println(result[0]);

        for (int i = 0; i <candies.length ; i++) {
            int extra = 4;
            extra = extra+candies[i];
            for (int j = 0; j < candies.length; j++) {
                if (extra<candies[j]){
                    result[i] = false;
                    break;
                }
                else
                    result[i] = true;
            }
        }
        System.out.println(Arrays.toString(result));



    }
}
