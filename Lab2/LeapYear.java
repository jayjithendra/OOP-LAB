import java.util.Scanner;
class year
{
    public static void main(String args[])
    {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        y=sc.nextInt();
        if (y%4!=0)
        {
            System.out.println("Common year.");
        }
        else if (y%100!=0)
        {
            System.out.println("Leap year.");
        }
        else if(y%400!=0)
        {
            System.out.println("Common year.");
        }
        else 
        {
            System.out.println("Leap year.");
        }
    }
}