package Cloops.inter;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int on=num;
        while(num!=0)
        {
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("sum of the digits of "+on+" is :"+sum);
    }
    
}
