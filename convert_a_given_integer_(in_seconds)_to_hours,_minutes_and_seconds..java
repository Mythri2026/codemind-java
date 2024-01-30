import java.util.Scanner;
public class Code{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,hr,m,s;
        a=sc.nextInt();
        hr=a/3600;
        m=(a/60)%60;
        s=a%60;
        System.out.printf("H:M:S-%d:%d:%d",hr,m,s);
    }
}