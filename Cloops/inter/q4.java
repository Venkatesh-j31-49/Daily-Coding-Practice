package Cloops.inter;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();

        int res=1;
        if(n==0)
        {
            System.out.println(1);
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                res*=x;
            }
            System.out.println(res);
        }
    }
    
}
