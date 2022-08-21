import java.util.Scanner;
public class Array1 {
    public static Scanner scn=new Scanner(System.in);
    public static void takeInput(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    }
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");

        }
    }

    public static boolean findELement(int[]Array,int data){
        for(int i=0;i<Array.length;i++)
        {if (Array[i]==data)
        return true;}
        return false;


    }

    public static int firstIndex(int[]arr,int data){
        int i;
        int length=arr.length;

         for(i=0;i<length;i++){
             if(arr[i]==data)

                    break;

         }
         return  i;
    }

    public static int lastIndex(int[]arr,int data){
        int i;
        int length=arr.length;
        int len=length-1;
        for( i=len;i>=0;i--){
            if(arr[i]==data)
            break;


    }
        return i;

    }

    public static void main(String[]args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        System.out.println(arr);
        takeInput(arr);
        printArray(arr);
        System.out.println("entern an number to check its existance");
        int D=scn.nextInt();
        boolean rock=findELement(arr,D);
        System.out.println("so the result of the number exist or not is "+rock);
        System.out.println("jj"+arr);

        int fI=firstIndex(arr,D);
        int LI=lastIndex(arr,D);
        System.out.println("the first Index of the  is :"+fI);
        System.out.println("the Last  Index of the  is :"+LI);
    }
}
