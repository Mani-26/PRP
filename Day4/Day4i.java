package Day4;
public class Day4i {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<arr.length;i++){
            if (i==2) {
                System.out.print(55+" ");
            }
            else if(i>2){
                System.out.print(arr[i-1]+" ");
            } else {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
