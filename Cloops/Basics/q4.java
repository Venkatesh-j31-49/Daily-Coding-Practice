package Cloops.Basics;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a =sc.nextInt();
        double b=sc.nextInt();
        double height=Math.sqrt((a*a)-(b/2)*(b/2));
        double Area=(b*height)/2;
        System.out.println(Area);
    }
    
}
