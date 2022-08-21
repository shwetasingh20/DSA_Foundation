import java.util.Scanner;
public class subset_binary_wala_by_aman_sir {
    public static void subset(int []a,int n){

        int total =(int)Math.pow(2,n);
        System.out.print(total);
        for(int i=0;i<total;i++){
            int temp=i;

            String str=new String("");

            for(int j=n-1;j<=0;j--){
                int r=temp%2;
                 temp=temp/2;

                 if(r==0){
                     str="_"+" " + str; }
                 else {
                     str=a[j]+" "+str; }


            }System.out.println(str);

        }
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++){
         a[i]=scn.nextInt();
        }

        subset(a,n);

        }
    }

