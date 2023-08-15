import java.util.*;
public class pro1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int n=str.length();
    if(n>0&&n<=100){ 
      int odd=0,even=0;
      for(int i=0;i<n;i++){ 
        if(i%2==1)
          odd+=(str.charAt(i)-48);
        else 
          even+=(str.charAt(i)-48);
      }
      System.out.println(Math.abs(odd-even));
    }
    else System.out.println("INVALID INPUT");
  }
}