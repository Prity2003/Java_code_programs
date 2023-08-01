public class fibonacci {
    public static void name(String[] args) 
    {
        int n1=0,n2=1,n3,n=5;
        for(int i=2;i<n; i++)
        {
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }    
    }
}


