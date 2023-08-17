import java.util.Scanner;
public class Inherit1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();
        String st1="Mani";
        String st2="Mani";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println();
        System.out.println(st1==st2); 
        System.out.println(st1.equals(st2));
        // char c='m';
        // System.out.println((int) c);
    }
}