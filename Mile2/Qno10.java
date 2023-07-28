public class Qno10 {
    public static void main(String[] args) {
        int  arr[]={1724, 5283, 1937,2};
        System.out.println(findnum(arr));
    }
    static int findnum(int arr[]){
        int odd=0,even=0;
        for (int i =0;i<3;i++) {
            while (arr[i]>0) {
                int temp=arr[i]%10;
                if (temp%2==0) {
                    even+=temp;
                } else {
                    odd+=temp;
                }
                arr[i]/=10;
            }
        }
        if (arr[3]%2==0) {
            return even;
        } else {
            return odd;
        }
    }
}
