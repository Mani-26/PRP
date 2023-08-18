import java.util.*;

public class Prog3 {
    public static void main(String[] args) {
        int inp[] = { 4, 5, 2, 8, -99, 67 };
        System.out.println(findAns(inp));
    }

    public static char[] findAns(int input1[]) {
        int arr[] = new int[input1.length];
        char out[] = new char[input1.length];
        for (int i = 0; i < input1.length; i++) {
            arr[i] = input1[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input1.length; j++) {
                if (arr[i] == input1[j]) {
                    out[j] = (char)(97 + i);
                }
            }
        }
        return out;
    }
}