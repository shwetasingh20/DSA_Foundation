import java.util.Scanner;

public class Toggle {
     public static String Toggel(String s){
         StringBuilder ans=new StringBuilder();
          for(int i=0;i<s.length();i++){
              char ch=s.charAt(i);
              if(ch>='A' && ch<='Z'){
                  char lc=(char)(ch-'A'+'a');
                 ans.append(lc); //convert to lower case
              }

              else{
                  char uc=(char)(ch+'A'-'a');
                  ans.append(uc);  //convert to upper case
              }
          }
          return ans.toString();
     }
    public static void main (String []args){
        Scanner scn=new Scanner(System.in);
        String S=scn.next();
        String s=Toggel(S);
        System.out.println(s);
    }
}
