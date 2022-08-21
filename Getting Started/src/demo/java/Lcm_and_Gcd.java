package demo.java;
import java.util.Scanner;


public class Lcm_and_Gcd {

    public static int GCD(int N, int M) {
        int min;int i;

        if (N < M) {
            min = N; }
        else {
            min = M;
        }
        for(i= min;i>0;i--){
            if (N%i==0 && M%i==0){

                break;

            }
        }
        return i;
    }


    public static int LCM(int N, int M,int gcd){
int lcm;
lcm=(N*M)/gcd;
return lcm;
    }


    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2= scn.nextInt();

        int gcd=GCD(num1,num2);
       int lcm= LCM(num1,num2,gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
