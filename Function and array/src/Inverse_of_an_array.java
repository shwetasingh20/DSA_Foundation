import java.util.Scanner;
public class Inverse_of_an_array {

    public static int[] Inverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            B[value] = i;
        }


        return B;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int A[] = new int[s];
        for (int i = 0; i < s; i++) {
            A[i] = scn.nextInt();
        }

        int[] inv = Inverse(A);
        for (int ele : inv) {
            System.out.print(ele);

        }


    }

}
