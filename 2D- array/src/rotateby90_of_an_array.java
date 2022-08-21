import java.util.Scanner;
public class rotateby90_of_an_array {
    public static Scanner scn=new Scanner(System.in);
    public static void Transpose(int A[][]){
        int n=A.length;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                k=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=k;
            }
        }
    }
    public static void Input(int A[][]){
        int n=A.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=scn.nextInt();
            }
        }
    }
    public static void Rearrange(int A[][]){
        int n=A.length;
        int k=0;
       for(int i=0;i<n;i++){
           for(int j=n-1;j>=n/2;j--){
               k=A[i][j];
               A[i][j]=A[i][n-1-j];
               A[i][n-1-j]=k;
           }
       }
    }
    public static void Display(int A[][]){
        int n=A.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int n=scn.nextInt();

        int A[][]=new int[n][n];
        Input(A);
        Transpose(A);
        Rearrange(A);
        Display(A);

    }
}
