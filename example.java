import java.util.Scanner;
import java.util.Random;
public class example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Eneter the first letter of your name");
        char ch = scan.next().charAt(0);
        char a = (char)('a'+rnd.nextInt(26));
        System.out.println(a);
        if(ch == a)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
