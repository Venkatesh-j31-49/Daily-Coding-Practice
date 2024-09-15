package Cloops.Basics;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double R=sc.nextDouble();
        System.out.println("Enter side / base");
        double a =sc.nextDouble();
        System.out.println("Enter base: ");
        double b=sc.nextDouble();


        double Perimeter=2*(Math.PI)*R;
        System.out.println(Perimeter);

        double PoET=3*a;
        System.out.println(PoET);

        double perp=2*(a+b);
        System.out.println(perp);

        double por=2*(a+b);
        System.out.println(por);

        double pos=4*a;
        System.out.println(pos);




        
        }
    
}
