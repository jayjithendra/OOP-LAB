abstract class Shape
{
    abstract double calcArea();
}
class recArea extends Shape
{
    double l;
    double b;
    recArea(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    public double calcArea()
    {
        return l*b;
    }
}
class circArea extends Shape
{
    double r;
    circArea(double r)
    {
        this.r=r;
    }
    public double calcArea()
    {
        return Math.PI*Math.pow(r,2);
    }
}
class areaTest1
{
    public static void main(String args[])
    {
        recArea r1 = new recArea(15,10);
        circArea c1 = new circArea(3);
        System.out.println("Area of rectangle is:"+r1.calcArea());
        System.out.println("Area of circle is:"+c1.calcArea());
    }
}