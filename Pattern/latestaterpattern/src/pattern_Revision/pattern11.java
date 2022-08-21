package pattern_Revision;
import java.util.*;
public class pattern11 {
    public static void pattern11(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);}
            System.out.println("");
        }
    }


    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        pattern11(a);
    }
}
