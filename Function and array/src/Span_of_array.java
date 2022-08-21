import java.util.Scanner;
public class Span_of_array {
    public static Scanner scn=new Scanner(System.in);
    public static void takeInput(int[] arr){
        for(int i=0;i<arr.length;i++){
             arr[i]=scn.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static int Span(int[]arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }//max=Math.max(max,a[i]);
           if(arr[i]<min){
                min=arr[i];
            }//min=Math.min(min,a[i]);

        }

        int Span=max-min;
        return Span;
    }
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        takeInput(arr);
        int span=Span(arr);
        System.out.println("Span of the number is "+span);


    }
}
