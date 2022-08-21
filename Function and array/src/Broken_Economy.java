import java.util.Scanner;
public class Broken_Economy {

    public static void Binary(int arr[],int X ) {
    int li=0;
    int ri=arr.length-1;
    int mid=-1;
    int floor=0;
    int celling=0;
        while (li <= ri) {
            mid = (li + ri) / 2;
            if (arr[mid] == X) {
               floor=arr[mid];
               celling=arr[mid];
               break;

            } else if (arr[mid] > X) {
                ri = mid - 1;
                floor=arr[mid];

            } else {
                li = mid + 1;
                celling=arr[mid];
            }
        }
            System.out.println(floor);
        System.out.println(celling);
        //or System.out.println( +" "+arr[ri]);



        }


    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int X=scn.nextInt();
        int li=0;
        int ri=arr.length-1;
        Binary(arr,X);

    }
}
