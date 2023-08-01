import java.util.Scanner;

public class string_to_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter the string");
        String name = scan.nextLine();
        char[] ch = name.toCharArray();
       
        for(char e: ch)
        {
        System.out.println(e);
        }
    }
}
