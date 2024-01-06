import java.util.Scanner;
public class Heron
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double pie=3.14;
        double area=pie*(r*r);
        System.out.printf("%.2f",area);
    }
}