package TestPractice;
import java.util.Scanner;
public class Test21i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = sc.nextInt();
        int money = sc.nextInt();
        int price[] = new int[cont];
        int vol[] = new int[cont];
        for (int i = 0; i < cont; i++) {
            price[i] = sc.nextInt();
        }
        for (int i = 0; i < cont; i++) {
            vol[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0, sto = 0, temp = 0;
        for (int i = 0; i < cont; i++) {
            if (price[i] == money) {
                System.out.println(vol[i]);
                temp = 1;
            } else if (sum <= money) {
                sum += price[i];
                sto += vol[i];
            }
        }
        if (temp == 0) {
            System.out.println(sto);
        }
    }
}