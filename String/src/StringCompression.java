import java.util.Scanner;
public class StringCompression {
    public static String compression1(String str){
        int l=str.length();

        String ans=""+str.charAt(0);
        for(int i=1;i<l;i++){
            String previous=""+str.charAt(i-1);

            String current=""+str.charAt(i);
            if(previous.equals(current)==false){
                ans+=current;
            }
            else{continue;}


        }
        // write your code here

        return ans;
    }
    public static void main (String []args){
        Scanner scn=new Scanner (System.in);
        String S=scn.next();
        String c=compression1(S);
        System.out.println(c);
    }
}
