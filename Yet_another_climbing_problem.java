import java.util.Scanner;
public class Code
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            int a=sc.nextInt();
        int b=sc.nextInt();
        int x,y;
            if(a>=b)
            {
                x=a/b;
                y=a%b;
                System.out.println(x+y);
            }
            else
            {
                System.out.println(a);
            }
        }
    }
}