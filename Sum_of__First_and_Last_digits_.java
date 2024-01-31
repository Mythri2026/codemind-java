import java.util.Scanner;
public class Code{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,f=0,l=0,s=0;
        n=sc.nextInt();
        l=Math.abs(n%10);
        while(n!=0){
            f=Math.abs(n%10);
            n=n/10;
        }
        s=f+l;
        System.out.println(s);
        }
}