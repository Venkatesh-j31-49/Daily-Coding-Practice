package Cloops.inter;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n =sc.nextDouble();
        double sum=0;
        double avg=0;

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;

        }
        avg=sum/n;
        System.out.println(avg);
    }
    
}
