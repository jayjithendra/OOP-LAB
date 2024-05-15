class Stack
{
    int stck[]=new int[10];
    int tos;
    Stack()
    {
        tos=-1;
    }
    void push(int item)
    {
        if (tos==9)
        {
            System.out.println("OverFlow");
        }
        else
        {
            stck[++tos]=item;
        }
    }
    int pop()
    {
        if(tos==-1)
        {
            System.out.println("UnderFlow");
            return 0;
        }
        else
        {
            return (stck[tos--]);
        }
    }
    void display()
    {
        for(int i=0;i<=tos;i++)
        {
            System.out.print(stck[i]+"\t");
        }
    }
    void peek()
    {
        System.out.println("The top value is:"+stck[tos]);
    }
}