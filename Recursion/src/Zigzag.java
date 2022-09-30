import java.util.Scanner;

public class Zigzag {
    public static void main(String[]args){
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        zz(n);
    }
    public static void zz(int n){
        if(n==0){return;}
        System.out.print(n);
        zz(n-1);

        System.out.print(n);
        zz(n-1);
         
        System.out.print(n);
    }
}
