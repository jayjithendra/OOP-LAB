import java.util.Scanner;
class triangle
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("FOR EACH");
        int arr[] = new int[n];
        i=1;
        for (int val : arr) {
            int a[] = new int[i];
            for(int k:a){
                System.out.print(i + " ");
            }
            System.out.println();
            i++;
        }
    }
}