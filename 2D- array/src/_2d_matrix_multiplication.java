import java.util.Scanner;

public class _2d_matrix_multiplication {
public static Scanner scn=new Scanner(System.in);
public static void input(int A [][]){
    for(int i=0;i<A.length;i++){
        for(int j=0;j<A[0].length;j++){
            A[i][j]=scn.nextInt();
        }
    }
}
    public static void display(int A[][]){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
               System.out.print(A[i][j]);
            }
        }
    }

  // public static int[][] MatMul(int [][]A,int[][]B){

 //   }
public static void main(String[]args){

    int n1=scn.nextInt();
    int m1=scn.nextInt();
    int A[][]=new int[n1][m1];
        input(A);
    int n2=scn.nextInt();
    int m2=scn.nextInt();
    int B[][]=new int[n2][m2];
        input(B);

        if(m1!=n2){
            System.out.println("Invalid Input");
        }

        else{
           // int [][]C=MatMul(A,B);
        }
  }

}
