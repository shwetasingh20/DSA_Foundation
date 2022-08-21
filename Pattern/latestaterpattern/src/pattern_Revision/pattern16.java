package pattern_Revision;
import java.util.Scanner;
public class pattern16 {
    public static void pattern16(int n){
  int nst=1,nsp=n*2-3,nst1=1;
  for(int i=1;i<=n;i++){
      for(int cst=1;cst<=nst;cst++){
          System.out.print(cst+"\t");
      }

      for(int csp=1;csp<=nsp;csp++){
          System.out.print("\t");

      }

      int count=i;
      for(int cst1=1;cst1<=nst1;cst1++){
          System.out.print(count+"\t");
          count--;

      }
      if(i==n-1){
          nst1++;

          nsp=nsp-2;
      }
      else{
          nst1++;
          nst++;
          nsp=nsp-2;
      }
      System.out.println("");
  }

    }
    public static void main (String[]args){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        pattern16(a);
    }
}
