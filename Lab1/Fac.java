import java.util.Scanner;
class Fac
{
public static void main(String args[])
{
int a,i,fac=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
a=sc.nextInt();
for(i=2;i<=a;i++)
{
fac=fac*i;
}
System.out.println("Factorial:"+fac);
}
}