package demo.java;
import java.util.*;

public class Pythagorean_Triplet {
    public static void main(String []args){
        Scanner scn= new Scanner(System.in);
        int n1 =scn.nextInt();
        int n2 =scn.nextInt();
        int n3 =scn.nextInt();
        int Hyp;
        if(n1>n2&& n1>n3){
            Hyp=(n2*n2)+(n3*n3);
            n1=n1*n1;
            if (n1==Hyp){
                System.out.println("true");
            }
            else System.out.println("false");

        }
        else if (n2>n1&& n2>n3){
            Hyp=(n1*n1)+(n3*n3);
            n2=n2*n2;
            if (n2==Hyp){
                System.out.println("true");
            }
            else System.out.println("false");
        }

        else if (n3>n1&& n3>n2){
            Hyp=(n1*n1)+(n3*n3);
            n3=n3*n3;
            if (n3==Hyp){
                System.out.println("true");
            }
            else System.out.println("false");
        }

    }
}
