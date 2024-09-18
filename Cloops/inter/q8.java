package Cloops.inter;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int hcf=1;
        int min=(a<b)?a:b;
        for(int i=1;i<=min;i++)
        {
            if((a%i==0)&& b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
    
}
