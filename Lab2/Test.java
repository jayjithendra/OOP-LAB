import java.util.Scanner;
class test
{
    public static void main(String args[])
    {
        int x=10;
        double y=x;
        System.out.println(y);//10.0//
        double a=10.5;
        int b=a;//error: incompatible types: possible lossy conversion from double to int//
        System.out.println(b);
        double p=10.5;
        int q=(int) p;
        System.out.println(q);//10//
    }
}