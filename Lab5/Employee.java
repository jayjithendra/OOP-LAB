import java.util.Scanner;
class Employee 
{
    String name;
    String city;
    float basicsalary;
    float houserent;
    float da;
    float hra;
    float totalsalary;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name:");
        name = sc.nextLine();
        System.out.println("Enter employee city:");
        city = sc.nextLine();
        System.out.println("Enter basic salary:");
        basicsalary = sc.nextFloat();
        System.out.println("Enter house rent:");
        houserent = sc.nextFloat();
        System.out.println("Enter dearness allowance:");
        da = sc.nextFloat();
        System.out.println("Enter HRA:");
        hra = sc.nextFloat();
    }
    float calculate()
    {
        totalsalary = (basicsalary + basicsalary * da/100 + basicsalary * hra/100 );
        return totalsalary;
    }
    void display()
    {
        System.out.println("Total salary: " + calculate());
    }
}
class Company
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee();
        emp.getdata();
        emp.display();
    }
}