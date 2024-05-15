class Student_Detail
{
    String name;
    int id;
    static String college_name="MIT";
    Student_Detail(String n,int i)
    {
        this.name=n;
        this.id=i;
    }
    void display_details()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("College Name: "+college_name);
    }
}
class sdtest
{
    public static void main(String args[])
    {
        Student_Detail sd1=new Student_Detail("Jay",1);
        Student_Detail sd2=new Student_Detail("man",2);
        sd1.display_details();
        sd2.display_details();
    }
}