import java.util.Scanner;
public class Code
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=sc.nextInt();
        int x=2*n*m*r*512/1024;
        System.out.println(x+" KB");
    }
}