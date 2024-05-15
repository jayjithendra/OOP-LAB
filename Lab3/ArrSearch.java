import java.util.Scanner;
class search
{
    public static void main(String args[])
    {
        int a[]= { 1,2,4,4,5,6,4,3 };
        int n;
        System.out.println("Enter value to be searched:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i:a)
        {
            if(n==a[i])
            {
                System.out.println("a["+i+"]");
            }
        }

    }
}