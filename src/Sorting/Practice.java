package Sorting;

public class Practice {
    public static void main(String[] args) {
        int[] p = {89,5,4,6,89};
        for(int i=0;i<p.length;i++){
            int end = p.length-i-1;
            int max =getMax(0,end,p);
            swap(max,end,p);
        }
        for(int n :p){
            System.out.println(n);
        }
    }
    static int getMax(int start,int end,int[] p){
        int max = start;
        int i =0;
        while(i<=end){
            if(p[max]<p[i]){
                max = i;
            }
            i++;
        }
        return max;
    }
    static void swap(int start,int end,int[] p){
        int temp = p[start];
        p[start] = p[end];
        p[end] = temp;
    }
}
