package Cloops.Basics;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius:");
        double R=sc.nextDouble();

        System.out.println("Enter length: ");
        double l=sc.nextDouble();

        System.out.println("Enter width: ");
        double w=sc.nextDouble();

        System.out.println("Enter height: ");
        double h=sc.nextDouble();

        double voc=((Math.PI)*R*R*h)/3;
        System.out.println("Volume of cone : "+voc);

        double ba=l*w;
        double vop=ba*h;
        System.out.println("Volume of prism: "+vop);

        double vocy=Math.PI*R*R*h;
        System.out.println("Volume of cylinder: "+vocy);

        double vos=(4*Math.PI*R*R*R)/3;
        System.out.println("Volume of Sphere: "+vos);

        double vopy=(ba*h)/3;
        System.out.println("Volume of pyramid:"+vopy);



      


    }
    
}
