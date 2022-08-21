package Out_of_FJP_Site;

import java.util.Scanner;

public class patternhollowDimond {

    public static void  pattern(int n){
        int nsp=1,nst=(n/2);

        for(int i = 1; i<= n ;i++){


            for(int cst = 1; cst<=nst;cst++){
                System.out.print("*\t");
            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");

            }

            for(int cst = 1; cst<=nst;cst++){
                System.out.print("*\t");
            }


            System.out.println(" ");
            int temp=(n/2)+1;
            if(i<temp)
            { nsp=nsp+2;
            nst=nst-1;}
            else {
                nsp = nsp - 2;
                nst = nst + 1;
            }

        }
    }


    public static void main(String []args){
        Scanner scn= new Scanner(System.in);
        int a = scn.nextInt();
        pattern(a);
    }

}
