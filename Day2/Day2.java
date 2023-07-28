package Day2;
import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        //decimal hexadecimal octal
        // int a=10,b=017,c=0X3A;
        // System.out.println(a+" "+b+" "+c);

        
        Scanner sc = new Scanner(System.in);
        String op = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        switch (op) {
            case "+":
                System.out.println(a + b);
                break;

            case "-":
                System.out.println(a - b);
                break;

            case "/":
                System.out.println(a/b);
                break;
            
            case "*":
                System.out.println(a*b);
                break;
            
            case "%":
                System.out.println(a%b);
                break;
            default:
                break;
        }
    }
}
