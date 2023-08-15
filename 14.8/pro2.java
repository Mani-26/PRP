import java.util.Scanner;
public class pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = 0;
        while (true) {
            int age = sc.nextInt();
            if (age > 0 && age <= 120) {
                if (age < 17)
                    amt += 200;
                else if (age >= 17 && age <= 40)
                    amt += 400;
                else
                    amt += 300;
            } 
            else if (age == -1) {
                System.out.println(amt);
                return;
            }
            else {
                System.out.println("INVALID INPUT");
                return;
            }
        }
    }
}