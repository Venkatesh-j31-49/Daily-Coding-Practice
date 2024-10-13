package Cloops.Basics;
import java.util.Scanner;

public class q14 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
int pro=1;
int r=0;
int sum=0;
int res=0;
while(n>0)
{
    r=n%10;
    sum=sum+r;
    pro=pro*r;
    n=n/10;

}
res=pro-sum;
System.out.println(res);
   
}    
}
