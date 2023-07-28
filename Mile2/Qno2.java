public class Qno2 {
    public static void main(String[] args) {
        int ar[] = { 123,234,345}; 
        System.out.println(findAns(ar));
    }
    static int findAns(int arr[]) {
        int a = 0, b = 0;
        for (int i : arr) {
            if (i <= 0) {
                a++;
            }
        }
        if (a == arr.length) { 
            return 0;
        } 
        else {
            int temp = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] == arr[j]) {
                        b++;
                        temp = arr[i];
                    }
                }
            }
            if (b != 0) {
                 return temp;
            } else {
                return arr[arr.length - 1];
            }
        }
    }
}