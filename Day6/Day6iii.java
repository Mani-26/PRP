package Day6;

public class Day6iii {
    public static void main(String[] args) {
        int arr[] = { 1724, 5283, 1937 };
        System.out.println(findpin(arr));       
    }
    
    static int findpin(int arr[]) {
        int freq[] = new int[10];
        String s = "";
        int max = 0, min = 9, maxf = 0, minf = 0, maxn = 0, minn = 9;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                int r = arr[i] % 10;
                freq[r]++;
                arr[i] = arr[i]/ 10;
            }
        }//max = 0, min = 9
//  0   2   2   2   1   1   0   2   1   1   =>freq[i]
//  0   1   2   3   4   5   6   7   8   9   =>i
        for (int i = 0; i < freq.length; i++) {//i=8
            if (max <= freq[i]) { // max = 2  | freq[i] = 2
                max = freq[i];//2
                maxf = i;//7
            }
            if (freq[i] > 0 && freq[i] < min) {// min = 1  | freq[i] =1
                min = freq[i];//1
                minf = i;//4
            }
        }
//  0   2   2   2   1   1   0   2   1   1   =>freq[i]
//  0   1   2   3   4   5   6   7   8   9   =>i
        // maxn=0,minn=9;
        for (int i = 0; i < freq.length; i++) {// i=9
            if (freq[i] > 0) {
                if (i > maxn) {// i= 9 | maxn=8
                    maxn = i;// 9
                }
                if (i <= minn) {// i= 3 | minn=1
                    minn = i;// 1
                }
            }
        }
        //maxf=7, minf=4,maxn=9,minn=1
        s += maxf;//7
        s += minf;//74
        s += maxn;//749
        s += minn;//7491
        return (Integer.parseInt(s));
    }
}
