package Cloops.inter;
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double n=sc.nextDouble();
        double CI=p*Math.pow((1+r/(n*100)),n*t)-p;
        System.out.println("The compound Interest is :"+CI);
    }
    
}
