package Out_of_FJP_Site;
import java.util.Scanner;
public class PatternDimond {


    public static void Pattern(int n){
        int nst= 1,nsp=n/2 ;
        for (int i=1;i<=n;i++){
            for(int csp=1;csp<=nsp;csp++)
            System.out.print("\t");
            for(int cst=1;cst<=nst;cst++)
                System.out.print("*\t");

            if(i<=n/2) {
                nsp--;
                nst = nst + 2;
            }
            else{
                nsp++;
            nst=nst-2;}
             System.out.println();
        }}

        public static void main(String[] args){
            Scanner scn= new Scanner(System.in);
            int a = scn.nextInt();
            Pattern(a);

        }


}
