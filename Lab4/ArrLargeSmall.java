import java.util.Scanner;
class arrlargesmall
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
        int min=a[0];
        int max=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            min=a[i];
            else if(a[i]>max)
            max=a[i];
        }
        System.out.println("Largest= "+max+" Smallest= "+min);
    }
}