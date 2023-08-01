import java.util.Scanner;
public class Areaofcircle {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double pi=3.14,A;
        A=pi*r*r;
        System.out.println("A is "+A);
    }
    
}
