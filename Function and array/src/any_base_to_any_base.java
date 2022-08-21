import java.util.Scanner;
public class any_base_to_any_base {
    public static int  atod(int n,int b){
        int multiplier=1,sum=0,rem,multipler=1;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum=sum+rem*multiplier;
            multiplier=multiplier*b;
            
        }
        return sum;
    }
    public static int dtoa(int n,int b){
        int sum=0,multiplier=1,rem;
        while(n!=0){
            rem=n%b;
            n=n/b;
            sum=sum+rem*multiplier;
            multiplier=multiplier*10;
        }
        return sum;
        
    }
    
    public static void main(String[]args){
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int b1=scn.nextInt();
        int b2=scn.nextInt();

       int decimal=atod(n,b1);
       int dtob=dtoa(decimal,b2);
       System.out.println(dtob);

    }
}
