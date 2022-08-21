import java.util.Scanner;


public class decimal_to_anybase {
    public static int decimal_to_binary (int n,int b)  {
        int sum=0,multiplier=1,rem;
        while(n!=0){
            rem=n%b;
            n=n/b;
            sum=sum+rem*multiplier;
            multiplier=multiplier*10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int ask=1;
        while(ask!=0){
            int n=scn.nextInt();
            int b=scn.nextInt();
            int decimal=decimal_to_binary(n,b);
            System.out.println(decimal);
            int a1=scn.nextInt();
            ask=a1;
        }




    }
}
