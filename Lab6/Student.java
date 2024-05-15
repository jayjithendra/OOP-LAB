class student
{
    int reg_no;
    String name;
    int age;
    public student(int r,String s,int a)
    {
        this.reg_no=r;
        this.name=s;
        this.age=a;
    }
}
class PG extends student
{
    int sem;
    double fees;
    PG(int reg_no,String name,int age,int sem)
    {
        super(reg_no,name,age);
        this.sem=sem;
        this.fees=12000.0;
    }
}
class UG extends student
{
    int sem;
    double fees;
    UG(int r,String s,int a,int sem)
    {
        super(r,s,a);
        this.sem=sem;
        this.fees=10000.0;
    }
}
class studtest
{
    public static void main(String args[])
    {
        PG pg=new PG(32,"Jay",19,1);
        UG ug=new UG(43,"Man",22,1);
        System.out.println(pg.reg_no+"\t"+pg.name+"\t"+pg.age+"\t"+pg.sem+"\t"+ pg.fees);
        System.out.println(ug.reg_no+"\t"+ug.name+"\t"+ug.age+"\t"+ug.sem+"\t"+ ug.fees);
    }
}