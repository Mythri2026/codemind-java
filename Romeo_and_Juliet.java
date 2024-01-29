import java.util.Scanner;
public class Code{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        int t=(x*5+y*10)/z;
        System.out.println(t);
    }
}