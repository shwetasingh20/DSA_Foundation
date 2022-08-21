import java.util.Scanner;
public class Search_in_Two_D_Array {
    public static   Scanner scn=new Scanner(System.in);
    public static void Input(int A[][]){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                A[i][j]= scn.nextInt();
            }
        }
    }
    public static void Search(int A[][],int x){
        int n=A.length;
        int j=n-1;
        int ansi=0;
        int ansj=0;

        for(int i=0;i<n;i++){
            if (A[i][j]==x){
                 ansi=i;
                 ansj=j;
                 break;
            }
            else if(A[i][j]>x){
                for(j=n-2;j>=0;j--){
                    if(A[i][j]==x){
                         ansi=i;
                         ansj=j;
                         break;
                    }
                }
            }
        }
        System.out.println("i="+ ansi+ "j="+ansj);
    }
    public static void main(String args[]){

        int n=scn.nextInt();

        int A[][]=new int[n][n];
        Input(A);
        int x=scn.nextInt();
        Search(A,x);

    }
}