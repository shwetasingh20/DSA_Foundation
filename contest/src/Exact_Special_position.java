import java.util.Scanner;
public class Exact_Special_position {

    public static void sp(int[][]arr){
            int n=arr.length;
            int m=arr[0].length;

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==1){
                        System.out.println(i+", "+j);
                    }
                }
            }

        }

        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            int n=scn.nextInt();
            int m=scn.nextInt();
            int [][]arr=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=scn.nextInt();
                }
            }
            sp(arr);
            //write your code here..
        }





}
