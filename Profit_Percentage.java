import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double profit=(b-a)/(a*1.0);
        System.out.printf("%.2f",profit*100);
    }
}