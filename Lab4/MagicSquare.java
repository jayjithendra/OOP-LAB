import java.util.Scanner;
class magicsquare
{
    public static void main(String args[])
    {
        int a[][]=new int[10][10];
        int row[]=new int[10];
        int col[]=new int[10];
        int m,i,j,n;
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
        int npsum=0;
        for(i=0,j=m-1;i<m;i++,j--)
        {
            npsum=npsum+a[i][j];
        }
        int psum=0;
        for(i=0;i<m;i++)
        {
            psum=psum+a[i][i];
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                row[i]=row[i]+a[i][j];
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                col[i]=col[i]+a[j][i];
            }
        }
        int flag=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(row[i]!=col[j])
                {
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            if(psum==npsum)
            {
                if(psum==row[0])
                {
                    System.out.println("Magic Square");
                }
                else
                {
                    System.out.println("Not a Magic Square1");
                }
            }
            else
            {
                System.out.println("Not a Magic Square2");
            }
        }
        else
        {
            System.out.println("Not a Magic Square3");
        }
    }
}