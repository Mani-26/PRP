package program;
import java.util.*;
public class Pro1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int j=sc.nextInt();
    int m=sc.nextInt();
    int p=sc.nextInt();
    if(n>0 && k>0 && j>0 && m>0 && p>0){
      int a=0,b=0;
      a=(m/k);
      b=(p/j);
      if(m%k!=0||p%j!=0) a++;
      System.out.println(n-(a+b));
    }
    else{
      System.out.println("INVALID INPUT");
    }
  }
}