package Cloops.inter;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int on=n;
        int revn=0;
        while(n!=0)
        {
            int digit=n%10;
            revn=revn*10+digit;
            n/=10;
        }
        if(revn==on)
        {
            System.out.println(revn+" is a Palindrome number");
        }
        else
        {
            System.out.println(revn+" is not a Palindrome number");
        }
    }
    
}
