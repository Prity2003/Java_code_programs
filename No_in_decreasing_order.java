import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class No_in_decreasing_order{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enetr the number 1");
        int n1 = scan.nextInt();
        System.out.println("Enetr the number 2");
        int n2 = scan.nextInt();
        System.out.println("Enetr the number 3");
        int n3 = scan.nextInt();

        if(n1>n2)
        {
            if(n2>n3)
            {
                System.out.println(" "+n1+" "+n2+" "+n3);
            }
            else{
                System.out.println(" "+n1+" "+n3+" "+n2);
  
            }
        }
        else if(n2>n3)
        {
            if(n3>n1)
            {
                System.out.println(" "+n2+" "+n3+" "+n1);
            }
            else{
                System.out.println(" "+n2+" "+n1+" "+n3);
            }
        }
        else if(n3>n1)
        {
            if(n1>n2)
            {
            System.out.println(" "+n3+" "+n1+" "+n2);
            }
            else{
                System.out.println(" "+n3+" "+n2+" "+n1); 
            }

        }  
        else{
            System.out.println("All the numberes are same");
        }
}
}