import java.util.*;
public class Prog2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next().toLowerCase();
    sc.close();
    int n=str.length();
    if(n>0&&n<=4){
      int a=0,b=0,d=0,ans=0;//12ba
      for(int i=n-1;i>=0;i--){
        char c=str.charAt(i);//a
        if(c>='a'&&c<='g')
         a=(c-'a')+10;//10
        else if(Character.isDigit(c))
         a=c-'0';
        else{
         System.out.println("INVALID INPUT");
         return;
        }
        b=(int)Math.pow(17,d);//1
        d++;//1
        ans+=(a*b);//10
      }
      System.out.println(ans);
    }
    else System.out.println("INVALID INPUT");
  }
}