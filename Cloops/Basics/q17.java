package Cloops.Basics;
import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ln=1;
        while (true) { 
            int n=sc.nextInt();
            if(n==0)
            {
                break;
            }
            if(n>ln)
            {
                ln=n;
            }

            
        }
        System.out.println(ln);
    }
    
}
