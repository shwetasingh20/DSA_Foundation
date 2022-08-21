package pattern_Revision;

import java.util.Scanner;

public class fjp_pattern11 {
    public static void pattern11(int n){
            int nst=1,nsp=0,counter=1;
            for(int i=1;i<=n;i++){

                for(int csp=1;csp<=nsp;csp++){
                    System.out.print("\t");
                }

                for(int cst=1;cst<=nst;cst++){
                    System.out.print(counter+"\t");

                    counter++;
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
