package Day1;
class Day1 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int count=0;
        for (int i = 1; i < args.length; i++) {
            if(Integer.parseInt(args[i])>n){
                count++;
            }
        }
        System.out.println(count);
    }
}