package demo.java;
import java.util.*;


public class rotation {

    public static int count(int n ){
            int count=0;
            while(n!=0){
            n/=10;
            count++;}
            return   count;
    }


    public static int Rotation(int n,int k,int c){
             int R1,R2;
             int remultiplier=(int)Math.pow(10,k);
             int sumultiplier= (int)Math.pow(10,c-k);
             R1=n%remultiplier;
            R2=n/remultiplier;
            int sum= (R1*sumultiplier)+R2;
            return sum;
            }

    public static void main(String[]args){
        System.out.println("Rotation of a number by a number k");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        int count=count(num );
        int K= scn.nextInt();
      K=K%count;
       if(K<0){
           K=count+K;
       }
        int catc= Rotation( num,K,count);
        System.out.println("the rotation of the positive number is "+catc);




    }
}
