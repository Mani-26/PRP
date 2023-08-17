import java.util.*;
public class Prog10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.next();
        String input2=sc.next();
        int input3=sc.nextInt();
        int input4=sc.nextInt();
        sc.close();
        System.out.println(findAns(input1,input2,input3,input4));
    }
    public static String findAns(String input1,String input2,int input3,int input4){
        String out="";
        if(input1.length()!=input2.length()){
            if (input1.length()>input2.length()) {
                out+=input1.charAt(input1.length()-1)+input2;
            } else {
                out+=input2.charAt(input2.length()-1)+input1;
            }
        }
        else{
            if(input1.compareTo(input2)<0){
                out+=input2.charAt(input2.length()-1)+input1;
            }
            else{
                out+=input1.charAt(input1.length()-1)+input2;
            }
        }   
        String temp=""+input3;
        out+=temp.charAt(input4-1);
        out+=temp.charAt(temp.length()-input4);
        return toggle(out);
    }
    public static String toggle(String out){
        String r="";
        for(char c:out.toCharArray()){
            if (Character.isLetter(c)&&Character.isUpperCase(c)) {
                r+=Character.toLowerCase(c);
            } 
            else if(Character.isLetter(c)&&Character.isLowerCase(c)){
                r+=Character.toUpperCase(c);
            }
            else{
                r+=c;
            }
        }
        return r;
    }
}