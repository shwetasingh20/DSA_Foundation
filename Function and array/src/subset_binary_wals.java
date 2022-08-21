import java.util.Scanner;
public class subset_binary_wals {
    public static void Binary_conversion(int count,int n,int a[]){

        for (int i=0;i<count;i++){
            int len=0;int bin=0;int multiplier=1;
            int c=i;
            for(int j=0;j<n;j++){
               int rem= c%2;
                c=c/2;
                bin=bin+rem*multiplier;
                multiplier=multiplier*10;


            }
            for(int p=0;p<n;p++){
            int remb=bin%2;
            bin=bin/2;
            int b=a[len];

            if (remb==0){System.out.print("_  ");}
            else if (remb==1){System.out.print(b+" ");}
             len++;
            }
            System.out.println();
        }
    }

public static void main(String args[]){
    Scanner scn=new Scanner(System.in);
    System.out.println("enter the length of the array");
    int n=scn.nextInt();
    System.out.println("now enter the element of the array");
    int [] a=new int [n];
    int times=1;
    for(int i=0; i<n; i++) {
        a[i]=scn.nextInt();
        times=times*2;
    }
   // System.out.print("**********"+times + n);
    Binary_conversion(times,n,a);
  //  for(int ele:a){
    //    System.out.print(ele);
  //  }
}
}
