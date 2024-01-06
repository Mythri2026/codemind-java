import java.util.Scanner;
public class Heron
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double s;
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        s=(a+b)/2;
        System.out.printf("%.4f",s);
    }
}