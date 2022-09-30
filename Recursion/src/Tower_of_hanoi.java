import java.util.Scanner;

public class Tower_of_hanoi {
public static void main(String agrs[]){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    int A=scn.nextInt();
    int B=scn.nextInt();
    int C=scn.nextInt();

    TOH(n,A,B,C);
}
public static void TOH(int n,int A, int B, int C){
    if(n==0) return;
    TOH(n-1,A,C,B);
    System.out.println(n +"["+A+ "->" +B+"]");
    TOH(n-1,C,B,A);
}
}
