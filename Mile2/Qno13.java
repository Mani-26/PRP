
public class Qno13 {
    public static void main(String[] args) {
        System.out.println(findpin(3521,2452,1352,38));
    }
    static int findpin(int l1,int l2,int l3,int l4){

        if (l1>=1000&&l1<=9999&&l2>=1000&&l2<=9999&&l3>=1000&&l3<=9999) {
            return maxi(l1)*maxi(l2)*maxi(l3)+l4;
        } else {
            return 0;
        }
    }
    static int maxi(int m){
        int large=Integer.MIN_VALUE;
        while(m>0){
            int temp=m%10;
            large=Math.max(large,temp);
            m/=10;
        }
        return large;
    }
}