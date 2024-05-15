class digitpnc
{
    public static void main(String args[])
    {
        int a[]= { 1,2,3,4 };
        int i,j,temp,k,l;
        System.out.println("Without duplication");
        for (j = 0; j <= 4; j++) 
        {
            for (i = 0; i < 3; i++) 
            {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                for(k=0;k<4;k++)
                {
                    System.out.print(a[k]);
                }
                System.out.print("\n");
            }
    
        }
        System.out.println("With duplication");
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=4;j++)
            {
                for(k=1;k<=4;k++)
                {
                    for(l=1;l<=4;l++)
                    {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(l);
                        System.out.print("\n");
                    }
                }
            }
        }

    }
}