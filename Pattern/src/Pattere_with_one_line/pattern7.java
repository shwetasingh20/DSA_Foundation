package Pattere_with_one_line;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class pattern7 {

    public static void Pattern7(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if (r==c){
                    System.out.print("\t*");

                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println("");
        }

    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        Pattern7(a);

    }
}
