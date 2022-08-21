import java.util.Scanner;

public class rotate_an_array {

    public static void reverse(int[]arr,int i,int j){
        while(i<=j){
            int a=arr[i];
            arr[i]=arr[j];
            arr[j]=a;
            i++;
            j--;
        }
    }
    public static void rotate(int A[],int k){
if(k<0){
    k=k%A.length;
    k=k+A.length;
}
if(k>A.length){
    k=k%A.length;
}

int i1=0;
int j1=A.length-1-k;
int i2=A.length-k;
int j2=A.length-1;
int i=0;
int j=A.length-1;
reverse(A,i1,j1);
reverse(A,i2,j2);
reverse(A,i1,j2);
for(int ele:A){
    System.out.print(ele);
}

    }
    public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
             A[i]=scn.nextInt();

        }
        System.out.println("enter the rotating factor");
        int n2=scn.nextInt();
        rotate(A,n2);
    }
}
