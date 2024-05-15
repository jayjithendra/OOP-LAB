import java.util.Scanner;
class NumberType
{
public static void main(String args[])
{
int a,i;
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.println("Enter number:");
a=sc.nextInt();
if(a==0)
{
System.out.println(a+":Is Zero!");
}
if(a>0)
{
System.out.println(a+":Is Positive!");
}
if(a<0)
{
System.out.println(a+":Is Negative!");
}
}
}
}