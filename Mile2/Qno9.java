public class Qno9 {
    public static void main(String[] args) {
        System.out.println(findpin(3521,2452,1352,38));
    }
    static int findpin(int i1,int i2,int i3,int i4){
        int a=maxi(i1)*mini(i1);  
        int b=maxi(i2)*mini(i2);
        int c=maxi(i3)*mini(i3);
        return a+b+c-i4;
    }
    static int mini(int m){
        int small=Integer.MAX_VALUE;
        while(m>0){
            int temp=m%10;
            small=Math.min(small,temp);
            m/=10;
        }
        return small;
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