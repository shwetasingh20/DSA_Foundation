import java.util.Scanner;
public class State_of_wakanda_2 {
    public static Scanner scn=new Scanner(System.in);
    public static void Input(int A[][]){
        for(int i=0;i<A.length;i++){
            for (int j=0;j<A[0].length;j++){
                A[i][j]=scn.nextInt();
            }
        }
    }
    public static void wakanda(int A[][]){
        int n=A.length;
        int m=A[0].length;
        for(int j=0;j<m;j++){
            if (j%2==0){
                for(int i=n-1;i>=0;i--){
                    System.out.print(A[i][j]);
                }

            }
            else{

                for(int i=0;i<n;i++){
                    System.out.print(A[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){

        int n=scn.nextInt();
        int m=scn.nextInt();
        int A[][]=new int[n][m];
        Input(A);
        wakanda(A);

    }
}
