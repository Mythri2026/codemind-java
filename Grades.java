import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int f=(a+b+c+d+e)/5;
        if(f>=90)
        System.out.println("Grade A");
        else if(f>=80)
        System.out.println("Grade B");
        else if(f>=70)
        System.out.println("Grade C");
        else if(f>=60)
        System.out.println("Grade D");
        else if(f>=40)
        System.out.println("Grade E");
        else
        System.out.println("Grade F");
    }
}