package Day3;
public class Day3iii {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        if(a>=91 &&a<=100)
            System.out.println("Grade A");
        else if(a>=81 &&a<=90)
            System.out.println("Grade B");
        else if(a>=71 &&a<=80)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");
    }
}