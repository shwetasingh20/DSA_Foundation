package Out_of_FJP_Site;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= a; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
