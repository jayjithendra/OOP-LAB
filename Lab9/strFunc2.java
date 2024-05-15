import java.util.Scanner;
class strstrstr{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=1;
        while(n!=0){
            System.out.println("1.Comparing 2 strings \n 2.upper to lower and lower to upper \n 3. is it a substring? \n 4. Replace with hello \n 5.Exit");
            System.out.println("Enter a choice:");
            n = sc.nextInt();
            switch(n){
                case 1:
                System.out.println("Enter 1st String:");
                String str1 = sc.next();
                System.out.println("Enter 2nd String:");
                String str2 = sc.next();
                int comp = str1.compareTo(str2);
                if(comp==0){
                    System.out.println("Strings are equal");
                }
                else{
                    System.out.println("Strings are not equal");
                }
                break;
                case 2:
                System.out.println("EnterString:");
                String str = sc.next();
                StringBuffer newstr = new StringBuffer(str);
                for(int i = 0 ; i<str.length();i++){
                    char c = str.charAt(i);
                    if(Character.isLowerCase(c)){
                        newstr.setCharAt(i, Character.toUpperCase(c));
                    }
                    else if(Character.isUpperCase(c)){
                        newstr.setCharAt(i, Character.toLowerCase(c));
                    }
                }
                System.out.println("String after conversion:"+newstr);
                break;
                case 3:
                System.out.println("Enter String:");
                String str3 = sc.next();
                System.out.println("Enter String to be searched:");
                String str4 = sc.next();
                if(str3.contains(str4)){
                    System.out.println("It is a sub string");
                }
                else{
                    System.out.println("It is not a sub string");
                }
                break;
                case 4:
                System.out.println("Enter String:");
                String str5 = sc.next();
                System.out.println("Enter String to be replaced:");
                String str6 = sc.next();
                StringBuffer newstr1 = new StringBuffer(str5);
                if(str5.contains(str6)){
                    int index = str5.indexOf(str6);
                    newstr1.replace(index, str6.length(), "Hello");
                }
                else{
                    System.out.println("String not found");
                }
                System.out.println("New string:"+newstr1);
                break;
                case 5:
                n=0;
                break;
                default:
                System.out.println("Invalid");
        }
    }
}
}