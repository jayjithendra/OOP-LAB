import java.util.Scanner;
class multiply
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
        int m,i,j,n,p,q,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix A:");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter number of rows and columns of matrix B:");
        p=sc.nextInt();
        q=sc.nextInt();
        if(m!=q)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println("Enter values of A:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter values of B:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                c[i][j]=0;
                for(k=0;k<n;k++)
                {
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }

            }
        }
        System.out.println("The product is:\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}