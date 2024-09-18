package Cloops.inter;
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<2)
        {
            System.out.println("Enter number greater than 2");
        }
        else
        {
            int sum=1;
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    sum=sum+i;
                    if(i!=num/i)
                    {
                        sum+=num/i;
                    }
                }

            }
            if(sum==num)
            {
                System.out.println(num+" : is a perfect number");
            }
            else
            {
                System.out.println(num+" : is not a perfect number");
            }
        }
    }
    
}
