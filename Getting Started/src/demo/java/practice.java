package demo.java;
import java.util.*;

public class practice {
    public static int Count(int k){
        int counter=0;
        while(k!=0){
          k= k/10;
          counter++;
        }
        return counter;
    }

    public static int rotate(int n,int k,int count){
        int multiplier= (n%(int)Math.pow(10,k));
        int remainder=n/(int)Math.pow(10,k);
        int frontMultiplier=(int)Math.pow(10,count-k);
        int front=multiplier*frontMultiplier;
        System.out.println("multiplier"+multiplier);
        System.out.println("remainder"+remainder);
        System.out.println("front"+frontMultiplier);
        int result=front+ remainder;
        return result;
    }
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int k =scn.nextInt();
        int count=Count(n);
       int rot=rotate(n,k,count);
       System.out.println(rot);
    }
}
