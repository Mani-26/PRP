import java.util.*;

public class Qno4 {
    public static void main(String[] args) {
        int ar[] = { 10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67 };
        System.out.println(findnum(ar, 20));
    }

    static int findnum(int input1[],int input2) {
        int ans = 0, prime = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : input1) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                list.add(i);
                prime++;
            }
        }
        if (prime != 0) {
            Collections.sort(list);
            for (int i = 0; i < list.size() - 1; i++) {
                ans += list.get(i);
            }
        } else {
            Arrays.sort(input1);
            for (int i = 1; i < input1.length; i++) {
                ans += input1[i];
            }
        }
        return ans;
    }
}