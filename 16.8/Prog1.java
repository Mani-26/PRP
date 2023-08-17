import java.util.*;
public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, c = 10;
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = i % 5;
                switch (a) {
                    case 0:
                        x += c;
                        c += 10;
                        break;
                    case 1:
                        y += c;
                        c += 10;
                        break;
                    case 2:
                        x -= c;
                        c += 10;
                        break;
                    case 3:
                        y -= c;
                        c += 10;
                        break;
                    case 4:
                        x += c;
                        c += 10;
                        break;
                }
            }
            if (n < 6)
                System.out.println(x + " , " + y);
            else if (n == 6) {
                x = 90;
                y = -20;
                System.out.println(x + " , " + y);
            }
        } else
            System.out.println("INVALID INPUT");
    }
}