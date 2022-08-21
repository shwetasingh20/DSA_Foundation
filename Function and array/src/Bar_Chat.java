import java.util.Scanner;

public class Bar_Chat {
    public static Scanner scn= new Scanner(System.in);

    public static void takeInput(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Bar_chat(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             max=Math.max(max,arr[i]);
        }
int counter=0;
        int height=max;
        for(int j=0;j<max;j++){
            for(int i=0;i<arr.length;i++) {
                //if (max - arr[i]-counter <= 0)
                if (arr[i]>=height){
                    System.out.print("*\t");

                } else System.out.print(" \t");
            }

            System.out.println("");
            counter++;
            height--;
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
        public static void showArray(int[]arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        }


    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        takeInput(arr);
        Bar_chat(arr);
        Reverse(arr);
        showArray(arr);

    }
}
