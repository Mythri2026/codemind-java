import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='a' || n=='e' ||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
    }
}