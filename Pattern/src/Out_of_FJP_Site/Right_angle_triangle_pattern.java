package Out_of_FJP_Site;
import java.util.Scanner;

public class Right_angle_triangle_pattern{

    public static  void practic(int n)
    {// for the right angle trinagle patter we can assume nst = 1 and nsp=n-1
        int nst=1 ,nsp=n-1;
        for (int r= 1; r<=n;r++){

            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");

            }
            for(int cst=1;cst<=nst;cst++){
            System.out.print("*");

            }
            System.out.println("");
            nsp= nsp-1;//or nsp--; and nst++;
            nst=nst+1;
            //    *
            //   **
            //  ***
            // ****
            //*****
            //to print this  pattern

        }
    }
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        practic(a);



    }
}
