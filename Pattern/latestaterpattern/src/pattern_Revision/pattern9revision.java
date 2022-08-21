package pattern_Revision;
import java.util.Scanner;

public class pattern9revision {
    public static void pattern9(int n){
        int nsp1=0, nsp2=n-2, nst1=1,nst2=1;

        for(int i=1;i<=n;i++){
            for(int csp1=1;csp1<=nsp1;csp1++){
                System.out.print("\t");
            }
            for(int cst1=1;cst1<=nst1;cst1++){
                System.out.print("*\t");
            }
            for(int csp2=1;csp2<=nsp2;csp2++){
                System.out.print("\t");
            }
            for(int cst2=1;cst2<=nst2;cst2++){
                System.out.print("*\t");
            }

            if(i<n/2){
                nsp1++;
                nsp2=nsp2-2;

            }

            else if(i==n/2){
                nsp1++;
                nsp2=0;
                nst2=0;
                nsp2=-1;
            }
            else{
                nsp1--;
                nst2=1;
                nsp2=nsp2+2;

            }
        System.out.println("") ;
        }
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        pattern9(a);
    }
}
