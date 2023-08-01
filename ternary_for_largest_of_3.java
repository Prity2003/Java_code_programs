import java.util.Scanner;

public class ternary_for_largest_of_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        
        max(n1, n2, n3);
    }

    public static void max(int n1, int n2, int n3)
    {
        System.out.println((n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3));
    }
}
