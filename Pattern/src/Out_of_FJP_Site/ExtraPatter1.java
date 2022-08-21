package Out_of_FJP_Site;
import java.util.Scanner;
//    *
//   ***
//  *****
// *******
//*********
public class ExtraPatter1 {

    public static void Pattern(int n){

        int nst=1,nsp=n-1;
        for(int r=1; r<=n;r++){
            for(int csp=1;csp<=nsp ;csp++)
            {
                System.out.print(" ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");

            }
            System.out.println(" ");
            nst=nst+2;
            nsp--;
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        Pattern(a);
    }
}
