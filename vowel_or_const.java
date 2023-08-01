import java.util.Scanner;

public class vowel_or_const{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter");
        char ch = scan.next().charAt(0);

        if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
        {
            System.out.print(ch + " is vowel ");
        }
        else{
            System.out.print(ch + " is constant ");
        }

        
    }
}
