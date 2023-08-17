import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // int opt=sc.nextInt();
        sc.close();
        String ans="";
        String arr[]=str.split(" ");
        // if (opt==0) {
            // for (String string : arr) {
            //     System.out.println(string);
            // }
            for (int i = 0; i < arr.length; i++) {
                String s=arr[i];
                for (int j = (s.length()-1); j >= 0; j--) {
                    ans+=s.charAt(j);
                }
                ans+=" ";
            }
            System.out.println(ans);
        }
    }