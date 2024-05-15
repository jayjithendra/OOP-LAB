import java.util.Scanner;
import java.lang.Math;
class armstrong
{
    public static void main(String args[])
    {
        int x,temp,y;
        double sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        x=sc.nextInt();
        temp=x;
        while(temp!=0)
        {
            y=temp%10;
            sum=sum + Math.pow(y,3);
            temp=temp/10;
        }
        if (sum==x)
        System.out.println("Armstrong");
        else
        System.out.println("Not Armstrong");
    }
}