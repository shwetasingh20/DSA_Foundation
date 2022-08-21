package Out_of_FJP_Site;
import java.util.Scanner;

public class Patterntemplate {

    public static void pattern(int n) {

        int nsp = n, nst = n, csp, cst;
        for (int i = 1; i <= n; i++) {
            for (csp = 1; csp <= nsp; csp++) {
                System.out.print("_");
            }
            for (cst = 1; cst <= nst; cst++) {
                System.out.print("*");

            }
            System.out.println("\n");

            nsp+=0;
            nst+=0;
        }
    }

    public static void main(String[] args){

        Scanner scn= new Scanner(System.in);
        int a = scn.nextInt();
        pattern(a);
    }
}
