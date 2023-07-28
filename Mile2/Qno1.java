import java.util.*;
public class Qno1 {
    public static void main(String[] args) {
        int ar[] = { 10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67 };
        System.out.println(findnum(ar));
    }
    static int findnum(int arr[]) {
        int ans = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            int count = 0;
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            ans += list.get(i);
        }
        return ans;
    }
}