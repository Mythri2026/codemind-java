import java.util.Scanner;
public class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String onum = sc.nextLine();
        int num = Integer.parseInt(onum, 8);
 
        System.out.println(num);
    }
}
