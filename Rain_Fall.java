import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3)
        {
            System.out.printf("LIGHT");
        }
        else if(n>=3 && n<7)
        {
            System.out.printf("MODERATE");
        }
        else
        {
            System.out.printf("HEAVY");
        }
    }
}