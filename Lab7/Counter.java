class Counter
{
    static int a=0;
    Counter()
    {
        a++;
    }
    static int display()
    {
        return a;
    }
}
class counttest
{
    public static void main(String args[])
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        int n = Counter.display();
        System.out.println("Number of objects created:"+n);
    }
}