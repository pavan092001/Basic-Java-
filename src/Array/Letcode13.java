package Array;

public class Letcode13 {

    /* Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and
    all the elements on the secondary diagonal that are not part of the primary diagonal.*/
    public static void main(String[] args) {
        int[][] m = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int j =0;
        int sum=0;
        int i =0;
       while(i<m.length){
           sum+=m[i][j];
           i++;
           j++;
       }
       i = 0;
       j=m.length-1;
       while(i<m.length){
           if (i!=j)
               sum+=m[i][j];
           i++;
           j--;
       }
        System.out.println(sum);
    }
}
