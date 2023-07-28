package TestPractice;
import java.util.*;
public class Test21ii {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    sc.close();
    String ch[]=str.split("");
    String dup=str;
    if(dup.equals(str)){ 
      System.out.println("0");
    }
    else{
      HashSet<String> mm=new HashSet<String>();
      for(String c:ch){
        mm.add(c);}
        System.out.println(mm.size()-1);
    }
  }
}