import java.util.Scanner;
class bitwise
{
    public static void main(String args[])
    {
        int x;
        float p,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        x=sc.nextInt();
        p=x<<1;
        d=x>>1;
        System.out.println("Multiplied:"+p+"\nDivided:"+d);
    }
}