import java.util.Scanner;
public class strdemo {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enetr the string");

    String name = scan.nextLine();
    int length = name.length();
    for(int i=0; i<length; i++)
    {
        char ch = name.charAt(i);
        if(Character.isDigit(ch))
        {
            System.out.println(ch);
        }
    }
}

}
