import java.util.Scanner;
class Account
{
    String name;
    int acc_no;
    String acc_type;
    double balance;

    public Account(String s,int a,String at)
    {
        this.name=s;
        this.acc_no=a;
        this.acc_type=at;
        this.balance=0.0;
    }
    public void add(double b)
    {
        balance=balance+b;
    }
    public void display()
    {
        System.out.println("Balance is: "+balance);
    }
    public void withdraw(double b)
    {
        balance=balance-b;
    }
}
class Current extends Account
{
    double min_bal;
    Current(String name,int acc_no)
    {
        super(name,acc_no,"Current");
        this.min_bal=5000.0; 
    }
    void check()
    {
        if (balance<min_bal)
        {
            balance=balance-300;
            System.out.println("Below min balance.");
        }
        else
        System.out.println("Above min balance.");
    }
    void computeint()
    {
    }
}
class Savings extends Account
{
    double min_bal;
    double interest;
    Savings(String name,int acc_no)
    {
        super(name,acc_no,"Savings");
        this.interest=0.02;
        this.min_bal=4000.0;
    }
    void computeint()
    {
        balance=balance+(balance*interest);
    }
    void check()
    {
        if (balance<min_bal)
        {
            balance=balance-300;
            System.out.println("Below min balance.");
        }
        else
        System.out.println("Above min balance.");
    }

}
class acctest
{
    public static void main(String[] args)
    {
        Savings savingsacc = new Savings("Jay",32);
        Current curracc =new Current("man",36);
        savingsacc.add(30000);
        curracc.add(40000);
        savingsacc.computeint();
        curracc.computeint();
        savingsacc.display();
        curracc.display();
        savingsacc.withdraw(27000);
        curracc.withdraw(2000);
        savingsacc.check();
        curracc.check();
        savingsacc.display();
        curracc.display();
    }
}