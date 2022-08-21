import java.util.Scanner;

public class distinctnumbercount {


    public static int countSpecialNumbers(int n) {
        int coun=0;
        int Arr[]=new int[n];
        for(int i=0;i<n;i++){
            Arr[i]=i+1;
        }

        for(int k=0;k<n;k++){
            int count=0;
            int temp=Arr[k];
            int temp1=Arr[k];
            //digit counter
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            //array inserter
            int rem=0;
            int A[]=new int[count];
            for(int i=0;i<count;i++){

                rem=temp1%10;
                A[i]=rem;
                temp1=temp1/10;
            }
if (count>1) {
    for (int i = 0; i < count; i++) {
        for (int j = i + 1; j < count; j++) {
            if (A[i] == A[j]) {
                continue;
            } else {
                coun++;

            }
        }
    }
}
        }
        return coun;
    }

    public static void main(String []args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = countSpecialNumbers(n);
        System.out.print(c);
    }


}
