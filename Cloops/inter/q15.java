package Cloops.inter;
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int r =sc.nextInt();
        int fact=1;
        int factr=1;
        if(n<r)
        {
            System.out.println("Please enter n value greater than r");
        }
        else{

       

        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        for(int i=1;i<=r;i++)
        {
            factr*=i;
        }
        int factnr=1;
        for(int i=1;i<=(n-r);i++)
        {
            factnr*=i;
        }

        int npr=fact/(factnr);
        int ncr=fact/(factr*factnr);
        System.out.println(npr);
        System.out.println(ncr);

    }

    }
    
}
