import java.util.Scanner;

public class any_base_multiplication {

    public static int multiply_with_a_digit(int n,int m) {
        int ans2=0;int n1=n;int ans = 0;int count=0;
///please refer the video on 29 nov to study more
        while (m != 0){
            int pow1=1;
            n1=n;
            int d=m%10;
            int carry = 0;

            while (n1!= 0 &&carry!=0) {
                count++;
                System.out.println("count"+count);
                int  pow = 1;

                int multiply = ((n%10) * d) + carry;
                n1=n1/10;
                /*if (multiply >= 10) {*/
                    carry = multiply / 10;
                    multiply %= 10;
                /*} else {
                    carry = 0;
                }*/
                ans = ans + (multiply * pow);

                pow = pow * 10;
                System.out.println("pow and ans "+pow + ans);
                m=m/10;

                //System.out.println("n,m.ans,multiply carry"+n1+" "+m+" "+ans+" "+multiply+ " "+carry);
               }
            ans2=ans2+(ans*pow1);
            pow1=pow1*10;


    }
        return ans2;
    }

    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int multi=multiply_with_a_digit(n,m);
        System.out.println(multi);
    }
}
