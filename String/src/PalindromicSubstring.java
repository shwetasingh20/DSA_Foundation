import java.util.Scanner;
public class PalindromicSubstring {
    public static Boolean Palindrom(String S){
       int l=S.length();
       int j=l-1;
       for(int i=0;i<=l/2;i++){

               if (S.charAt(i)!=S.charAt(j)){
                   return false;
               } j--;


       }
       return true;
    }
    public static void Substring(String S){
        int l=S.length();
        for(int i=0;i<l;i++){
            for(int j=i+1;j<=l;j++){
                String a=S.substring(i,j);
               Boolean bol= Palindrom(a);
               if(bol==true){System.out.println(a);}
            }
        }
    }
    public static void main (String[]args){
    Scanner scn= new Scanner(System.in);
    String s=scn.next();

   Substring(s);

    }
}
