import java.util.Scanner;
class strprg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=1;
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        while(n!=0){
            System.out.println("\n 1.Palindrome check \n 2. Print in alphabetical order \n 3. reverse the string \n 4. concatenate revesed string \n 5.exit");
            System.out.println("Enter a choice:");
            n = sc.nextInt();
            switch(n){
                case 1:
                boolean x = isPalindrom(str);
                System.out.println("Is it a palindrome:"+x);
                break;
                case 2:
                String y = alphabetical(str);
                System.out.println("Alphabetical:"+y);
                break;
                case 3:
                String z = Reverse(str);
                System.out.println("Reverse:"+z);
                break;
                case 4:
                System.out.println("Concatenate:"+str.concat(Reverse(str)));
                break;
                case 5:
                n=0;
                break;
                default:
                System.out.println("Invalid");
            }
        }
    }
    public static String Reverse(String str){
        String rev="";
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            rev = ch+rev;
        }
        return rev;
    }
    public static boolean isPalindrom(String str){
        String rev = Reverse(str);
        boolean b = str.equals(rev);
        return (b);
    }
    public static String alphabetical (String str){
        int i,j;
        char[] arr = str. toCharArray();
        int n = str.length();
        for (i = 0; i < n; i++){
            for(j = i+1; j < n; j++){
                if(arr[i]>arr[j]){
                    char temp = arr [i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String str1 = String.copyValueOf(arr);
        return str1;
    }

}