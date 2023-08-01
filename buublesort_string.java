import java.util.Scanner;

public class buublesort_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of the string:");
        // int n = scan.nextInt();
        // String[] arr = new String[n];
        // System.out.println("Enter the strings: ");
        // String str = scan.nextLine();
        String[] arr = {"India","Australia","Japan","England","Paris"};
        int n = scan.nextInt();
        System.out.println("Before sorting: ");
        printarray(arr,n);
        BubbleSort(arr,n);
        System.out.println("After sorting: ");
        printarray(arr,n);
    }
    public static void printarray(String[] arr,int n) {
        for(int i=0; i<arr.length; i++)
        { 
            System.out.println(" " + arr[i]);
        }
        
    }
    public static void BubbleSort(String[] arr,int n) {
        String temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }
}
