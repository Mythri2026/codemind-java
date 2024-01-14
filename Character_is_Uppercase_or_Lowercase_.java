import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n>='A' && n<='Z')
        System.out.println("uppercase alphabet");
        else if(n>='a' && n<='z')
        System.out.println("lowercase alphabet");
        else
        System.out.println("not an alphabet");
    }
}