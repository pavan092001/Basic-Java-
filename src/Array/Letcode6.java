package Array;

public class Letcode6 {

    public static void main(String[] args) {
        //Given an array of integers nums, return the number of good pairs.
        //
        //A pair (i, j) is called good if nums[i] == nums[j] and i < j.
        // question number 1512
        int[] nums ={1,2,1,4,4,2};
        int goodpair= 0;
        for (int i = 0; i < nums.length ; i++) {
            int j = i+1;
            while (j< nums.length){
                if (nums[i]==nums[j]) {
                    goodpair++;
                }
                j++;
            }

        }
        System.out.println(goodpair);






    }
}
