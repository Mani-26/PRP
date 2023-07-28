public class Qno5 {
    public static void main(String[] args) {
        int ar[] = { }; // an array should declared here
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
            for (int i = 0; i <arr.length; i++) {
                for (int j = i+1; j <arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        b++;
                        temp = arr[i];
                        break;
                    }
                }
            }
            if (b != 0) {
                return temp;
            } else {
                return arr[0];
            }
        }
    }
}