import java.util.Scanner;
class Area
{
public static void main(String args[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a and b:");
a=sc.nextInt(); b=sc.nextInt();
c=a*b;
d=2*(a+b);
System.out.println("Area="+c);
System.out.println("Circumference="+d);
}
}