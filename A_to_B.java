import java.util.Scanner;
public class Code
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n,m;
         m=sc.nextInt();
         n=sc.nextInt();
         for(int i=m;i<=n;i++)
         {
             System.out.print(i + " ");
         }
     }
 }