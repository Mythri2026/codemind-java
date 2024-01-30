import java.util.Scanner;
public class Code{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double bs,hra,da,pf,gs;
        bs=sc.nextDouble();
        hra=sc.nextDouble();
        da=sc.nextDouble();
        pf=0.12*(bs);
        gs=bs+hra+da+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",gs);
    }
}