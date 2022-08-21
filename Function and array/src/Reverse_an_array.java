import java.util.Scanner;
public class Reverse_an_array {
    public static Scanner scn= new Scanner(System.in);

    public static void takeInput(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void showArray(int[]arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }


    public static void Reverse(int[]arr){
        int i=0;
        int j=arr.length-1;
        while (i <= j) {
            int a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
            i++;
            j--;
        }
    }

    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        takeInput(arr  );

        Reverse(arr);
        showArray(arr);

    }
}
