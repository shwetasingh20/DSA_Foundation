import java.util.Scanner;
public class Difference_of_two_array {

    public static int[] DA(int []A,int []B){
        int ans[]=new int[B.length];
        int i=A.length-1;
        int j=B.length-1;
        int k=ans.length-1;

        int Borrow=0;
        while(j>=0){
            int digit=0;
            digit=B[j]+Borrow;
           j--;
            if(i>=0){
                digit=digit-A[i];
                i--;
            }

            if(digit<0){
                digit=digit+10;
                Borrow=-1;
            }

            else {Borrow=0;}
            ans[k]=digit;
           k--;
        }

        return ans;
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int []A=new int[n1];
        for(int i=0;i<n1;i++){
            A[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int []B=new int[n2];
        for(int i=0;i<n2;i++){
            B[i]=scn.nextInt();
        }

        int [] ans = DA(A,B);
        int f=-1;

        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0){
                f=i;
                break;
            }
            if (f==-1){

                System.out.println("0");
                return;
            }
            for(int j = f;i<ans.length;j++){
              System.out.println(ans[j]);

           }
        }
    }
}
