import java.util.Scanner;
class Swap
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping a= "+a+" and b= "+b);
    }
}