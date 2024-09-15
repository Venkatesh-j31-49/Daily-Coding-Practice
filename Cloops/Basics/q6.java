package Cloops.Basics;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double d1=sc.nextDouble();
        Double d2=sc.nextDouble();
        Double a=sc.nextDouble();

        Double Area=(d1*d2)/2;
        System.out.println(Area);

        Double perimeter=4*a;
        System.out.println(perimeter);
    }
    
}
