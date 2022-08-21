package pattern_Revision;
import java.util.Scanner;

public class pattern11Usinggapstratagy {
    public static void pattern11(int n){
        int nst=1,nsp=0;
        for(int i=1;i<=n;i++){

            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            for(int cst=1;cst<=nst;cst++){
                System.out.print(nst+"\t");
            }

            nst++;
            System.out.println("");

        }

    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();
        pattern11(a);

    }
}
