package Cloops.inter;
import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n3;
        int n=sc.nextInt();
        System.out.print(n1+","+n2+",");
        for(int i=0;i<n-2;i++)
        {
            n3=n1+n2;
            System.out.print(n3+",");
            n1=n2;
            n2=n3;
            
        }
        //System.out.println(n1+","+n2+","+n3+",");



    }
    
}
