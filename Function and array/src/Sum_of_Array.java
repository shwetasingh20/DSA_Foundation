import java.util.Scanner;
public class Sum_of_Array {

    public static void Sum_of_two_Array(int[]A,int[]B){
        int n1=A.length;
        int n2=B.length;
        int size=(n1>n2)?n1:n2;
        int []ans=new int[size];
        int carry=0;


        int i=n1-1;
        int j=n2-1;
        int k=size-1;
        while(k>=0){

           int sum=0;
           sum=sum+carry;
           if(i>=0){
               sum+=A[i];
           }

           if(j>=0){
               sum+=B[j];
            }

           ans[k]=sum%10;
           carry=sum/10;


            i--;
           j--;
           k--;

        }
        if(carry>0){
        System.out.print(carry);}
       // for(int l=0;l<ans.length;l++){
        for(int ele:ans){//for each element  
        System.out.print(ele);}
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int []A=new int[n1];
        for (int i=0;i<n1;i++){
            A[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int []B=new int[n2];
        for (int i=0;i<n2;i++){
            B[i]=scn.nextInt();
        }

        Sum_of_two_Array(A,B);
    }

}
