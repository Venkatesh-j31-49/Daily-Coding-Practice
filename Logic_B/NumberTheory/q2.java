package Logic_B.NumberTheory;
import java.util.Scanner;

public class q2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean isprime=true;
    if(n<=1)
    {
        System.out.println(n+" : is not a Prime Number");
    }
    else
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
        
       isprime=false;
       break;
            }
        }
    }
    if(isprime)
    {
        System.out.println(n+" : is a Prime Number");

    }
    else
    {
        System.out.println(n+" : is not a Prime Number");
    }


}    
}
