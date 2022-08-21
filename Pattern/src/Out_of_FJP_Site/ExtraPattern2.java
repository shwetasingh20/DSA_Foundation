package Out_of_FJP_Site;
import java.util.Scanner;
///***********
// *********
//  *******
//   *****
//    ***
//     *
public class ExtraPattern2 {
    public static void pattern (int n){

        int nst=n+(n-1); int  nsp =0;
        for(int i=1; i<=n; i++)
        {
            for (int csp=1; csp<=nsp;csp++){
                System.out.print(" ");

            }
            for (int cst=1;cst<=nst;cst++){
                System.out.print("*");

            }

            System.out.println(" ");
            nsp++;
            nst =nst-2;


        }

    }

    public static void main (String []args ){
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        pattern(a);

    }
}
