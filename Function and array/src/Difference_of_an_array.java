import java.util.Scanner;
public class Difference_of_an_array {

     public static int[] sub(int[]A,int[]B){

         int Borrow=0;
         int[] ans=new int[B.length];
         int i=A.length-1;
         int j=B.length-1;// and the digit B will always be greater as per the question
         int k=ans.length-1;
         while(j>=0){
             int digit=0;
             digit=digit+Borrow+B[j];
             if(i>=0){
                 digit=digit-A[i];
             }

             if(digit<0){
                 digit=digit+10;
                 Borrow=-1;
             }
             else{Borrow=0;}

             ans[k]=digit;
              i--;
             j--;
             k--;
         }

         for(int ele:ans){//for each element
             System.out.print(ele);}
         return ans;
     }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int A[]=new int[n1];
        for (int i=0;i<n1;i++){
            A[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int B[]=new int[n2];
        for (int i=0;i<n2;i++){
            B[i]=scn.nextInt();
        }
        int ans[]=sub(A,B);

        int fnzi=-1;
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0)
            {
                fnzi=i;
                break;
            }

        }

        if(fnzi==-1){
            System.out.print("0");
        }
        else
        for(int i=fnzi;i<ans.length;i++){
            System.out.print(ans[i]);
        }

    }

 }
