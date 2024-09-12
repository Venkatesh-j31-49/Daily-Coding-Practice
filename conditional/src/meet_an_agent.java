import java.util.Scanner;

public class meet_an_agent {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number == PASSWORD)
        {
            System.out.println("Hello, Agent");
        }
        else{
            System.out.println("Access denied");
        }
    }
}