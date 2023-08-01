import java.util.Scanner;

public class array_of_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scan.nextInt();
        // String str = "Hello";
        String[] str = new String[size+1];
        System.out.println("Enter the string");
        for(int i=0; i < str.length; i++)
        {
            String name = scan.nextLine();
            str[i] = name; 
        }
        for(String e: str)
        {
            System.out.println(e);
        }
    }
}
