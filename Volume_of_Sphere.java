import java.util.Scanner;
public class Sphere
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double pie=3.14;
        double volume=((4.0/3.0)*pie*(r*r*r));
        System.out.printf("%.2f",volume);
    }
}