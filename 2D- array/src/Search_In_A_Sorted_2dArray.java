import java.util.Scanner;

public class Search_In_A_Sorted_2dArray {
public static Scanner scn=new Scanner(System.in);
public static void Input(int A[][]){
    for(int i=0;i<A.length;i++){
        for(int j=0;j<A.length;j++){
            A[i][j]=scn.nextInt();
        }
    }
}
public static void Search(int A[][],int x ){
    int n=A.length-1;
    int countX=1;
    int countY=1;
    int i=0;
    int j=0;
     for( i=0;countX==1;i++){
         countY=1;
         for(j=n;countY==1;j--){
             if(A[i][j]==x){countX=0;countY=0;}
             else if(A[i][j]>x){
                 for(j=n-1;j>=0;j--){
                     if (A[i][j]==x){
                         break;
                     }
                 }
             }
             else countY=0;

         }
     }

     System.out.println("i ="+i+" and j="+j);
}
public static void main(String[]args){

    int n=scn.nextInt();
    int A[][]=new int[n][n];
    int x=scn.nextInt();
    Input(A);
    Search(A,x);
}
}
