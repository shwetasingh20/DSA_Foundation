import java.util.Scanner;
public class decimal_addition {
    public static int  decimalAddition(int n, int m){
         int carry=0;int ans=0,multiplier=1;
         while(n!=0||m!=0||carry!=0){
             int sum=carry+n%10+m%10;
             n/=10;
             m/=10;
             carry=sum/10;//sum/b for any base additon
             sum=sum%10;//sum%b where b is base for any addition
             ans=ans+sum*multiplier;
             multiplier=multiplier*10;
         }
        return(ans);
        }


    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int addition=decimalAddition(n1,n2);
        System.out.println(addition);


    }

}
