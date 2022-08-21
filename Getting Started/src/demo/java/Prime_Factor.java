package demo.java;
import java.util.*;

public class Prime_Factor {

    public static void main(String[]args){

        Scanner scn= new Scanner(System.in);
        int number=scn.nextInt();
        int n= number;
        for (int i=2;i*i<=number;i++){

            while(n %i==0){

                n=n /i;
                System.out.print(i+" ");

            }

        }
        if(n!=1) //if the last leftout is not 1 then it is prime number so its a prime number

            System.out.println(n);
    }
}
