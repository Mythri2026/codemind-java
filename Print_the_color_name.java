import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char n;
        n=sc.next().charAt(0);
        if(n=='V')
        System.out.println("Violet");
        else if(n=='I')
        System.out.println("Indigo");
        else if(n=='B')
        System.out.println("Blue");
        else if(n=='G')
        System.out.println("Green");
        else if(n=='Y')
        System.out.println("Yellow");
        else if(n=='O')
        System.out.println("Orange");
        else if(n=='R')
        System.out.println("Red");
        else
        System.out.println("-1");
    }
}