import java.util.Scanner;

public class binary_to_decimal {
    public static int btod(int n){
        int rem,multiplier=1,sum=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum=sum+(rem*multiplier);
            multiplier=2*multiplier;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int conv=btod(n);
        System.out.println(conv);
    }

}
