import java.util.Scanner;
import java.lang.Math;
class evaluate
{
    public static void main(String args[])
    {
        double x,y;
        int i,j,n;
        float fac;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and n values:");
        x=sc.nextInt();
        n=sc.nextInt();
        y=x*(3.14159/180.0);
        double sine = 0;
        for(i=0; i<=n; i++){
            fac = 1;
            for(j=2; j<=2*i+1; j++){
                fac*=j;
            }
            sine+=Math.pow(-1.0,i)*Math.pow(y,2*i+1)/fac;
        }
        System.out.println("The sine of "+x+" is:"+sine);
        double sum=0.0;
        int k;
        for(k=1;k<=n;k++)
        {
            int s=1/k;
            sum +=(Math.pow(s,k));
        }
        System.out.println("The sum of "+n+" terms is:"+sum);
    }
}