import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,m;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        m=2*x*y*z*512;
        System.out.println(m);
    }
}