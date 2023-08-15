package program;
public class Pro2 {
        public static void main(String[] args) {
            String name = "John";
            int age = 25;
            double salary = 500.002;

            // Using printf to format and display output
            System.out.printf("Name: %s\n", name);          // %s is for string
            System.out.printf("Age: %d%n", age);            // %d is for integer
            System.out.printf("%.2f",salary);
            //System.out.println("\n"+salary);    // %.2f is for floating-point with 2 decimal places
        }
    }
    