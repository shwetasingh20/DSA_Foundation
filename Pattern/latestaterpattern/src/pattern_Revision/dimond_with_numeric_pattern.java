package pattern_Revision;
import java.util.Scanner;
public class dimond_with_numeric_pattern {
    public static void pattern(int n){
        int nst=1,nsp=n/2;
        for(int i=1;i<=n;i++){
            for (int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }
            int count=(i<=n/2+1)?i:n-i+1;
            for (int cst=1;cst<=nst;cst++){
                System.out.print(count+"\t");
                if(cst<=nst/2)
                    count--;
                else count++;
            }

            if (i<=n/2){
                nst=nst+2;
                nsp--;
            }
            else{
                nst=nst-2;
                nsp++;
            }

            System.out.println("");
        }

    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int a =scn.nextInt();
        pattern(a);

    }

}
