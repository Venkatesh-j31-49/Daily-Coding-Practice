package firstjava;
import java.util.Scanner;
public class op4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
      //  sc.nextLine();
        String op=sc.next();

        if(op.equals("+"))
        {
            System.out.println(a+b);
        }
        else if(op.equals("-"))
        {
            System.out.println(a-b);
        }
        else if(op.equals("*"))
        {
            System.out.println(a*b);
        }
        else if(op.equals("/"))
        {
            System.out.println(a/b);
        }
        else{
            System.out.println(0);
        }

    }
}
