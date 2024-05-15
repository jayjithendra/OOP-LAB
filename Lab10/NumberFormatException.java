import java.util.Scanner;
class NFE{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String str =sc.next();
        try{
            int a = Integer.parseInt(str);
            System.out.println("The entered number is:"+a);
        }catch(NumberFormatException ex){
            System.err.println("Invalid String");
        }
    }
}