import java.util.Scanner;
public class Binary {
    public static int binarySearch(int[]arr,int x){
        int index=0;
        int li=0;
        int ri=arr.length-1;
        int mid;
        while(li<=ri){
          mid=(li+ri)/2  ;
          index=mid;
          if(arr[mid]==x){
              return(mid);
          }
          else if(arr[mid]>x){
              ri=mid-1;// find in left
          }
          else{
              li=mid+1;//find in right
          }
        }
     return(-1);

    }

    public static void main(String[]args){
        int[]arr={4,6,8,10,12,14,16,18,20,22,24};
                //0 1 2 3  4   5  6  7  8  9  10
        int x=11;
        int ans=binarySearch(arr,x);
        System.out.println(ans);

    }
}
