package Logic_B.NumberTheory;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int or=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev+r*r*r;
            n=n/10;

        }
        if(rev==or)
        {
            System.out.println(or+": is an Armstrong Number");
        }
        else{
            System.out.println(or+" : is not an Armstrong Number");
        }

    }
    
}
