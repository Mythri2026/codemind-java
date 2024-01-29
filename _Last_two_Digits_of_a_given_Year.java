import java.util.Scanner;
public class Code{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=n%100;
        System.out.printf("%02d",r);
    }
}