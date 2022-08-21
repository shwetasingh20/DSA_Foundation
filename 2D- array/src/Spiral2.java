import java.util.Scanner;
public class Spiral2 {
    public static Scanner scn=new Scanner(System.in);
    public static void Input(int A[][]){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=scn.nextInt();
            }
        }
    }
    public static void Spiral(int A[][]){
        int n=A.length;
        int m=A[0].length;
        int total=n*m;
        int count=0;
        int minr=0;
        int minc=0;
        int maxr=n-1;
        int maxc=m-1;

        while(count<total){

            for(int j=minc;j<=maxc&&count<total;j++){
                System.out.print(A[minr][j]+" ");
                count++;
            }
        minr++;
            System.out.println();

            for(int i=minr;i<=maxr&&count<total;i++){
                System.out.print(A[i][maxc]+" ");
                count++;
            }
            maxc--;
            System.out.println();

            for(int j=maxc;j>=minc&&count<total;j--){
                System.out.print(A[maxr][j]+" ");
                count++;
            }
            maxr--;
            System.out.println();
            for(int i=maxr;i>=minr&&count<total;i--){
                System.out.print(A[i][minc]+" ");
                count++;
            }
            minc++;
            System.out.println();

        }
    }
    public static void main(String []args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int A[][]=new int[n][m];
        Input(A);
        Spiral(A);
    }
}
