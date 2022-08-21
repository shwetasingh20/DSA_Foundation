package pattern_Revision;
import java.util.Scanner;

public class fjp_after_pattern_11extra {
    public static void pattern_extra(int n){
        int nsp=n/2,nst=1;int counter=1;
        for(int i=1;i<=n;i++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("\t");
            }

            for(int cst=1;cst<=nst;cst++){
            System.out.print(counter+"\t");}


            if(i<=n/2){
                nsp--;
                nst+=2;
                counter++;
            }

            else {nsp++;
            nst-=2;
                counter--;
            }
            System.out.println();
        }

    }
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        pattern_extra(a);
    }
}
