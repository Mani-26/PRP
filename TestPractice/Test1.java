package TestPractice;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int[][] d = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Result of A * B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                d[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Result of (A * B) * C:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((d[i][0] * c[0][j]) + (d[i][1] * c[1][j]) + (d[i][2] * c[2][j]) + " ");
            }
            System.out.println();
        }
    }
}