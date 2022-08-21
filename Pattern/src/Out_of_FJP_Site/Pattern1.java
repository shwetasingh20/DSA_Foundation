package Out_of_FJP_Site;

import java.util.Scanner;

public class Pattern1 {
    public static void  pattern(int n){
        int nsp=n,nst=1;

        for(int i = 1; i<= n ;i++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("_");

            }

            for(int cst = 1; cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println(" ");
            nsp+=0;
            nst++;

        }
    }


    public static void main(String []args){
        Scanner scn= new Scanner(System.in);
        int a = scn.nextInt();
        pattern(a);
    }
}
