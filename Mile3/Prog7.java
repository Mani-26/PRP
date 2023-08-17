import java.util.*;
public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(findAns(str));
    }
    public static int findAns(String input1){
        List<Integer> num=new LinkedList<>();       
        List<Character> opt=new LinkedList<>();
        for (int i = 0; i < input1.length(); i++) {//i*-t5s-t8h1e4birds
            char c=input1.charAt(i);
            if (Character.isDigit(c)) { //if(c>='0'&&c<='9')
                num.add((c-'0'));
            }
            if(c=='+'||c=='-'||c=='/'||c=='*'){
                opt.add(c);
            }
        }//num={5,8,1,4}//opt={*,-,-}
        int a=num.get(0),b=0;
        for (int i = 0; i < opt.size(); i++) {//3
            b=num.get(i+1);//4 //a=35
            char c=opt.get(i);// -
            switch (c) {
                case '+':
                    a=a+b;
                    break;
                case '-':
                    a=a-b;
                    break;
                case '/':
                    a/=b;
                    break;
                case '*':
                    a=a*b;
                    break;
                default:
                    break;
            }
        }
        return a;
    }
}