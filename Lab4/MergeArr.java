import java.util.Scanner;
class mergearr
{
    public static void main(String args[])
    {
        int m,n,i,j,temp;
        System.out.println("Enter number of elements in Arr A and B:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int a[]= new int[n];
        int b[]= new int[m];
        int c[]= new int[m+n];
        System.out.println("Enter values of A:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter values of B:");
        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c[i]=a[i];
        }
        for(i=0;i<m;i++)
        {
            c[i+n]=b[i];
        }
        for(i=0;i<(m+n);i++)
        {
            for(j=i+1;j<(m+n);j++)
            {
                if(c[i]>c[j])
                {
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        for(i=0;i<(m+n);i++)
        {
            System.out.print(c[i]+"\t");
        }
    }
}