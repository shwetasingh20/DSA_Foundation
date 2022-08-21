
import java.util.Scanner;
public class decimal_or_any_base_subtraction {
    public static int subtraction(int n,int m){
        int borrow=0;int ans=0;int pow=1;
        while(n!=0){
            int sub=borrow+n%10-m%10;
            n=n/10;
            m=m/10;
            if (sub<0){
                borrow=-1;
                sub=sub+10;//base b sub=sub+b

            }
            else borrow=0;
            ans=ans+(sub*pow);
            pow=pow*10;

        }
        return ans;



    }

    public static void main(String[]agrgs){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    int sub =subtraction(n,m);
    System.out.print(sub);}
}
