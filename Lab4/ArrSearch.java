import java.util.Scanner;
class arrsearch
{
    public static void main(String args[])
    {
        int a[]= new int[10];
        int n,i,count=0,x;
        System.out.println("Enter number of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter values:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to be found:");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                count=count+1;
                System.out.println("found at position:"+(i+1));
            }
        }
        System.out.println("Total Number of occurances:"+count);
    }
}