import java.util.Scanner;
class trial
{
    public static void main(String args[])
    {
        int a,b,w,x,z;
        boolean y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values:");
        a=sc.nextInt();b=sc.nextInt();
        x=(a<<2) + (b>>2);
        y=(b > 0);
        z=(a + b * 100) / 10;
        w=a&b;
        System.out.println("Values are:\n"+x+"\n"+y+"\n"+z+"\n"+w);
    }
}