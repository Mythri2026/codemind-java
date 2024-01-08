import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        if(x>=(2*y))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}