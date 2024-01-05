import java.util.Scanner;
public class main
{
public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    double p=sc.nextDouble();
    double a=sc.nextDouble();
    double h=Math.sqrt(Math.pow(p,2)+Math.pow(a,2));
    System.out.printf("%.2f",h);
    }
}