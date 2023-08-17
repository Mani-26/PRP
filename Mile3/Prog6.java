import java.util.*;
public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int opt = sc.nextInt();
        System.out.println(findAns(str, opt));
    }
    public static String findAns(String input1,int input2){
        String ans="",ans2="";
        String arr[]=input1.split(" ");
        for (String s:arr) {
            for (int i = (s.length()-1); i >= 0; i--) {
                ans=ans+s.charAt(i);
            }
            ans+=" ";
        }
        if(input2==1){
        for (int j = 0; j <input1.length(); j++) {
            char c=input1.charAt(j);
            char d=ans.charAt(j);
            if (Character.isUpperCase(c)) {
                d=Character.toUpperCase(d);
            }
            else {
                d=Character.toLowerCase(d);
            }   
            ans2+=d;
        }      
            return ans2;
        }
        return ans;
    }
}