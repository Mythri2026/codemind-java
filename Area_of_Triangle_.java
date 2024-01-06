import java.util.Scanner;
public class Heron
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double s;
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}