import java.util.Scanner;
class Result
{
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][4];
    int b[]=new int[3];

    public void Store()
    {
        for(int i=0;i<3;i++)
        {
          System.out.println("Enter roll number and marks of student "+(i+1));
          for(int j=0;j<4;j++)
          {
            a[i][j]=sc.nextInt();
          }
        }
    }
    
    void DoTotal()
    {
      for(int i=0;i<3;i++)
      {
          int sum=0;
          for(int j=1;j<4;j++)
          {
            sum=sum+a[i][j];  
          }
          b[i]=sum;
      }

    }


    void Find()
    {
      for(int i=1;i<4;i++)
      {
          int small=a[0][i],c=0;
        for(int j=0;j<3;j++)
        {
          if(small<a[j][i])
             {
                 small=a[j][i];
                 c=j;
             }
        }
        System.out.println("Highest mark in subject "+i+" is "+small+" and it is obtained by student of roll number "+(a[c][0]));
      }
    }
    
    void FindTotal()
    {
        int count;
        if(b[0]>b[1])
        {
            if(b[0]>b[2])
               count=1;
            else
               count=3;
        }
        else if(b[1]<b[2])
            count=3;
        else 
            count=2;

        System.out.println("Highest Marks are obtained by student "+(count));
    }

    public static void main(String args[])
    {
        Result ob=new Result();
        ob.Store();
        ob.DoTotal();
        ob.Find();
        ob.FindTotal();
    }

}