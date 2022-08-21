import java.util.Scanner;
public class Exit_pioint {
    public static Scanner scn=new Scanner(System.in);
    public static void Input(int[][]A){
        int n=A.length;
        int m=A[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=scn.nextInt();
            }
        }
    }
    public static void Exitpoint(int [][]A){
        int n=A.length;
        int m=A[0].length;
        int dir=0;
        int i=0;
        int j=0;
        while(true){
            dir+=A[i][j];
            dir%=4;
            if(dir==0){
                j++;
            }
            if(dir==1){
                i++;
            }
            if(dir==2){
                j--;
            }
            if(dir==3){
                i--;
            }

            if(i<0 ||j<0||i>=n||j>=m){
                break;
            }
        }
        if(i<0)
            i++;
        else{
            if(i>=n)
                i--;}


        if(j<0)
            j++;
        else{
            if(j>=m)
                j--;}

        System.out.print(i+" "+j);

    }


    public static void main(String[] args) throws Exception {
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]A=new int[n][m];
        Input(A);
        Exitpoint(A);

        // write your code here
    }



}

/*

5
4
0 0 1 0
1 0 0 0
0 0 0 0
0 0 1 0
0 0 0 0
* */