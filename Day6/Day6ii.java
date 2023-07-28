package Day6;
public class Day6ii {
    public static void main(String[] args) {
        System.out.println(findpin(3521,2452,1352,21));
    }
    static int findpin(int i1,int i2,int i3,int i4){
        int odd=i1%10+(i1/100)%10+i2%10+(i2/100)%10+i3%10+(i3/100)%10+i4%10+(i4/100)%10;
        int even=(i1/10)%10+i1/1000+(i2/10)%10+i2/1000+(i3/10)%10+i3/1000+(i4/10)%10+i4/1000;
        if(i4%2==0)
        return even-odd;
        else
        return odd-even;
    }
}