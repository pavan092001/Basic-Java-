package Searching;

import java.util.Scanner;

public class SearchIn2dArray {


    public static void main(String[] args) {
        int[][] n = {
                {7,8,9},
                {15,18,25},
                {40,56,99}
        };
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int i =0;
        int j = n[i].length-1;
        while(i<n.length){
            while (j>=0){
                if(n[i][j] == target) {
                    System.out.println("found it" + i + "" + j);
                    i = n.length+1;
                    break;
                }
                else if(n[i][j]>target)
                    j--;
                else {
                    i++;
                }

            }
        }
    }
}
