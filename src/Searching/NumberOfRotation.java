package Searching;

public class NumberOfRotation {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int re = pivik(arr);
        if (re !=-1)
            System.out.println("the numeber of rotation is "+(re+1));
        else
            System.out.println("the number of rotation is zero");
    }
    
    static int pivik(int[] a){
        int start =0;
        int end = a.length;
        int mid ;
        while(start<=end){
            mid = start+(end-start)/2;
            
            
            if(mid<end && a[mid]>a[mid+1])
                return mid;
             if (start<mid && a[mid]<a[mid-1]) {
                return mid-1;
             }
             if (a[mid] == a[start] && a[mid] == a[end]){
                 if (end>start && a[start]>a[start+1])
                     return start;
                 start++;
                 if ( end>start && a[end]<a[end-1])
                     return end-1;
                 end --;
             }else if (a[start]<a[mid] || (a[start]==a[mid]) && a[mid]>a[end])
                 start = mid+1;
             else
                 end =  mid -1;
        }
        return -1;
        
    }
}
