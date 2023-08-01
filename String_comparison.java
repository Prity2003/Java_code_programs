import java.util.Scanner;

public class String_comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S1 = "A";
        String S2 = "A";
        String S3 = "a";
        String St = new String("A");

        // System.out.println(S1==S2);
        // System.out.println(S1==S3);
        // System.out.println(S2==S3);
        // System.out.println(S1==St);

        // System.out.println(S1.equals(S2));
        // System.out.println(S1.equals(S3));
        // System.out.println(S2.equals(S3));
        // System.out.println(S1.equals(St));

        // System.out.println(S1.equalsIgnoreCase(S2));
        // System.out.println(S1.equalsIgnoreCase(S3));
        // System.out.println(S2.equalsIgnoreCase(S3));
        // System.out.println(S1.equalsIgnoreCase(St));

        System.out.println(S1.compareTo(S2));
        System.out.println(S1.compareTo(S3));
        System.out.println(S2.compareTo(S3));
        System.out.println(S1.compareTo(St));

 } 

}
