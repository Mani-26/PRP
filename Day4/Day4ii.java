package Day4;
import java.util.*;
public class Day4ii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];        
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j=i;j<n;j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    arr1[i]=arr[i];
                }
            }
            Arrays.sort(arr1);
            if(count>1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}