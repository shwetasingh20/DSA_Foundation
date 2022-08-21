import java.util.Scanner;

public class First_and_Last_Index {
    public static void FL(int []A,int x){
    int l=0;
    int r=A.length-1;
    int rcount=0;
    int lcount=0;
    while(l<=r){
    int mid=(l+r)/2;
    int m=mid;
        int H=0;
        int L=0;
    if(A[mid]==x){

            while(l<=r){
                mid=(l+r)/2;
                if(A[mid]==x){
                    H=mid;
                    l=mid +1;
                }
                 else if(A[mid]>x){

                    r=mid-1;
                }
                else{
                    l=mid+1;
                }

            }
        System.out.println(H);


            mid=m;
            l=0;
            r=mid-1;
            while(l<=r){

                mid=(l+r)/2;


                if(A[mid]==x){
                     L=mid;
                    r=mid -1;
                }
                else if(A[mid]>x){

                    r=mid-1;
                }
                else{
                    l=mid+1;
                }

            }
        System.out.println(L);
        }


    else if(A[mid]>x){

        r=mid-1;
    }
    else{
        l=mid+1;
    }
    }

    }
    public static void main(String []args){
        int []arr={1,2,3,3,4,4,4,4,4,4,5,6,7,8,9,10,11};
        int x=4;
        FL(arr,x);
    }

}
