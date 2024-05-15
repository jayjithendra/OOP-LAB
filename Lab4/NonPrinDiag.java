import java.util.Scanner;
class npd
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10];
        int m,i,j,n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows=columns");
        m=sc.nextInt();
        n=m;
        System.out.println("Enter values:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Non principle diagonal elements are:");
        for(i=0,j=m-1;i<m;i++,j--)
        {
            System.out.println(+a[i][j]);
            sum=sum+a[i][j];
        }
        System.out.println("The sum of Non principle diagonal elements:"+sum);
    }
}