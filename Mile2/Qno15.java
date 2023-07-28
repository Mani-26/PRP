import java.util.TreeMap;
public class Qno15 {
    public static void main(String[] args) {
        int[] ar = { 1724, 5283, 1937 };
        System.out.println(findPin(ar));
    }

    static int findPin(int arr[]) {
        String ans = "";
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int number : arr) {
            while (number != 0) {
                int digit = number % 10;
                m.put(digit, m.getOrDefault(digit, 0) + 1);
                number /= 10;
            }
        }
        int max = 0, min = 9, a = 0, b = 9;
        for (int i : m.keySet()) {
            int temp = m.get(i);
            if (temp >= max) {
                max = temp;
                if (i > a) {
                    a = i;
                }
            } else if (temp <= min) {
                min = temp;
                if (i < b) {
                    b = i;
                }
            }
        }
        ans += m.firstKey();
        ans += m.lastKey();
        ans += b;
        ans += a;
        return Integer.parseInt(ans);
    }
}