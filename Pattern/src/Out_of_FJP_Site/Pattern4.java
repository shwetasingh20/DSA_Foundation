package Out_of_FJP_Site;

import java.util.Scanner;

public class Pattern4 {

    public static void pattern(int n) {

        int nsp = 0, nst = n, csp, cst;
        for (int i = 1; i <= n; i++) {
            for (csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }
            for (cst = 1; cst <= nst; cst++) {
                System.out.print("*");

            }
            System.out.println("\n");

            nsp++;
            nst--;
        }
    }

    public static void main(String[] args){

        Scanner scn= new Scanner(System.in);
        int a = scn.nextInt();
        pattern(a);
    }
}
