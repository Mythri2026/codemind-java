import java.util.Scanner;
public class Code{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,y,w;
        n=sc.nextInt();
        y=(n/365);
        w=(n-y*365)/7;
        System.out.println(y);
        System.out.println(w);
    }
}