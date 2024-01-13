import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        while(n!=0)
        {
            n/=10;
            c++;
        }
    System.out.print(c);      
    }
    
}