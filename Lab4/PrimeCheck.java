import java.util.Scanner;
class primecheck
{
    public static void main(String args[])
    {
        int a[]= new int[10];
        int n,i,j;
        System.out.println("Enter number of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter values:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Prime numbers are:");
        for(i=0;i<n;i++)
        {
            int flag=1;
            for(j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            System.out.println(a[i]);
        }
    }
}