import java.util.Scanner;

public class anybase_to_decimal {
    public static int atod(int n,int b){
        int sum=0,multiplier=1,rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum=sum+(rem*multiplier);
            multiplier=multiplier*b;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int y=1;
        while(y!=0){
            System.out.println("Enter the number ");

        int n=scn.nextInt();
            System.out.println("enter the base of above number");
        int b =scn.nextInt();
        int decimal=atod(n,b);
        System.out.println(decimal);
        System.out.println("Enter the 1/0");
             y=scn.nextInt();
        }

    }

}
