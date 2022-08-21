package demo.java;
import java.util.*;

public class Rotation_without_any_Mathpow_function {

    public static int Count_a_digit(int num){
        int counter=0;
        while(num!=0){
            num = num / 10;
            counter++;
        }
        return counter;
    }
    public static int Rotation(int num,int k,int c){
        int R1,R2;int t=c-k;
        int rem =1; int sumu =1;

        while(k!=0){
            rem    = rem  *10;
            k--; }

        while((t)!=0){

            sumu   = sumu  *10;
        t--;}
        R1=num%rem ;
        R2=num/rem ;

        int sum= (R1*sumu )+R2;

        return sum;
    }
    public static void main(String[]args){

        Scanner scn= new Scanner(System.in);
        System.out.println("enter  two number for rotation " );
        int n =scn.nextInt();
        int count=Count_a_digit(n);
System.out.println(count);
        int k= scn.nextInt();

        if(k<0){
            k=count+k;

        }

        int catc= Rotation( n,k,count);

        System.out.println("the rotation of the positive number is "+catc);





    }
}
