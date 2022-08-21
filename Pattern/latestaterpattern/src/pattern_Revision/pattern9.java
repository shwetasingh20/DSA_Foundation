package pattern_Revision;
import java.util.Scanner;
public class pattern9 {
    public static void pattern9(int n) {

        int nsp1 = 0, nsp2 = n - 2, nst1 = 1, nst2 = 1;
        for (int i = 1; i <= n; i++) {

            for (int csp1 = 1; csp1 <= nsp1; csp1++) {
                System.out.print("\t");
            }

                System.out.print("*\t");

            for (int csp2 = 1; csp2 <= nsp2; csp2++) {
                System.out.print("\t");
            }
            if(i!=n/2+1)
                System.out.print("*\t");

                if(i <=(n/2)) {
                    nsp1++;
                    nsp2 = nsp2 - 2;}
                    else
                { nsp1-- ;
                    nsp2=nsp2+2;
                    nst2=1;

                    }

                    System.out.println("");

            }
        }


    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        pattern9(a);
    }
}
