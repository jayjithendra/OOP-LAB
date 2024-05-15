import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int a,b=0,org,rem;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
a = sc.nextInt();
org = a;
while(a!=0)
{
rem=a%10;
b=b*10+rem;
a=a/10;
}
if(org==b)
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
}

