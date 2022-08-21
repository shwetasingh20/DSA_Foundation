package pattern_Revision;
import java.util.Scanner;
public class diamondpattern15 {
    public static void pattern_diamond(int n) {
        int nsp = n / 2, nst = 1;int count=1;
        for (int i = 1; i <= n; i++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            int counter=(i<=n/2+1)?i:n-i+1;
            for (int cst = 1; cst <= nst; cst++) {

                System.out.print(counter+"\t");
                if(cst<=nst/2)
            counter++;
                else
                    counter--;

            }

            if(i <=n / 2) {
                nsp--;
                nst = nst + 2;
                count++;
            }
            else{ nsp++;
                nst = nst - 2;
                count--;
            }System.out.println("");

        }

    }
        public static void main (String[ ]args){
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            pattern_diamond(a);

        }
    }

