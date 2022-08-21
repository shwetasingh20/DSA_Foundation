import java.util.Scanner;
public class digit_frequency {
    public static int digit_frequency(int n,int d){
        int frequency=0,rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if (rem==d)
                frequency++;



        }

        return frequency;
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int frequency=digit_frequency(n,d);
        System.out.print(frequency);


    }
}
