package Cloops.inter;
import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        for(int i=0;i<=n;i++)
        {
            System.out.print(term+",");
            term=term+d;
        }
    }
    
}
