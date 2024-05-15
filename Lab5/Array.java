import java.util.Scanner;
class ArrayF
{
 Scanner sc= new Scanner(System.in);
 int a[]=new int[10];
 void Input()
 {
    System.out.println("Enter values");
    for (int i=0;i<10;i++)
    {
        a[i]=sc.nextInt();
    }
 }
 void Display()
 {
     for(int i=0;i<10;i++)
     {
      System.out.print(a[i]+" ");
     }
     System.out.println();
 }
 void DisplayLargest()
 {
     int large=a[0];
     for(int i=0;i<10;i++)
     {
       if(a[i]>large)
       {
           large=a[i];
       }
     }
     System.out.println("Largest value ="+large);
 }
 void DisplayAverage()
 {
     double sum=0.0,avg;
     for(int i=0;i<10;i++)
     {
         sum=sum+a[i];
     }
     avg=sum/10;
     System.out.println("Average = "+avg);
 }
 public static void main(String args[])
 {
     ArrayF ob=new ArrayF();
     ob.Input();
     ob.Display();
     ob.DisplayLargest();
     ob.DisplayAverage();
 }
}