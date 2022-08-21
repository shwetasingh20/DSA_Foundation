
import java.util.Scanner;
public class Array {
    public static Scanner scn=new Scanner(System.in);

    public static void takeInput(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();//Setter
        }
    }

    //length is a variable which exist in class
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//Getter
        }
            System.out.println();

    }

    public static boolean findElement(int[]jaa,int data) {


        for (int i = 0; i < jaa.length; i++) {
            if (jaa[i] == data)
                return true;
        }
        return false;}



    public static int maximum(int[]arr){
        int maxEle=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>maxEle)
            {maxEle=arr[i];}
        }
        return maxEle;


    }

    public static int minimum(int[]arr){
        int minEle=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {//maxEle=Math.max(maxEle,arr[i]);
            if(arr[i]<minEle)
            {minEle=arr[i];}
        }
        return minEle;
    }


    public static void main(String []args){
        int n=scn.nextInt();

        int[] arr=new int[n];
        takeInput(arr);
        printArray(arr);
        System.out.println("Enter a mumber to find out");
        int data=scn.nextInt();

        boolean ele=findElement(arr,data);
        System.out.println("the boolean is "+ele);
        int max=maximum(arr);
        System.out.println("the  maximum number is  "+max);



        int min=  minimum(arr);
        System.out.println("the  maximum number is  "+min);
    }

}