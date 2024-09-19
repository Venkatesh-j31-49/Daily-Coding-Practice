package Cloops.inter;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int on=n;
        int sum=0;
        while(on>0)
        {
            int digit=on%10;
            sum+=digit*digit*digit;
            on/=10;
        }
        if(sum==n)
        {
            System.out.println(n+" : is a Armstrong Number");
        }
        else{
            System.out.println(n+" : is not a Armstrong Number");
        }
    }
    
}
