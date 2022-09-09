package Searching;

public class InfiniteArray {

    public static void main(String[] args) {
        int[] p = {1,2,3,4,5,6,8,9,15,20,58,74,98,102};
        int result = findLength(p,102);
        System.out.println(result);

    }



    static  int findLength(int[] p,int target){
        int start=0;
        int end = 1;


        while (target>p[end]){
            int startnew = end+1;
            end = end+(end -start+1)*2;
            start = startnew;
        }
        return binarySearch(start,end,target,p);
    }

    static  int binarySearch(int start, int end, int target,int[] p){
        int mid =0;

        while(start<=end){
             mid = start+(end-start)/2;

             if (p[mid]>target)
                 end = mid -1;
             else if(p[mid]<target)
                 start = mid+1;
             else
                 return mid;
        }
        return mid;
    }
}
