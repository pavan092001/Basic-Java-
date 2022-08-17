package Array;

import java.util.Scanner;

public class ReverseArray  {
    public static void main(String[] args) {
        int [] arr = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

//        for (int n:arr
//             ) {
//            System.out.println(n);
//        }
        int j = arr.length-1;


        for (int i = 0; i <=j ; i++) {
            swap(arr,i,j);
            j--;
        }

        for (int n:arr
        ) {
            System.out.println(n);
        }


    }
    static  void swap(int[] arr,int a,int b){
         int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;

    }
}
