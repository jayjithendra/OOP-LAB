abstract class Shape
{
    abstract double calcArea();
}
class squArea extends Shape
{
    double a;
    squArea(double a)
    {
        this.a=a;
    }
    double calcArea()
    {
        return Math.pow(a,2);
    }
}

class triArea extends Shape
{
    double b;
    double h;
    triArea(double b,double h)
    {
        this.b=b;
        this.h=h;
    }
    double calcArea()
    {
        return 0.5*b*h;
    }
}
class areaTest3
{
    public static void main(String args[]) 
    {
        squArea s1 = new squArea(5);
        triArea t1 = new triArea(12,5);
        System.out.println("Area of square:"+s1.calcArea());
        System.out.println("Area of triangle:"+t1.calcArea());    
    }
}