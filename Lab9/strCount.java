import java.util.Scanner;
class count{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        int cCount = str.length();
        String[] words = str.split("\\s+");
        int wCount = words.length;
        String[] lines = str.split("\n");
        int lCount = lines.length;
        int vCount = countVowels(str);
        System.out.println("Number of characters:"+cCount);
        System.out.println("Number of words:"+wCount);
        System.out.println("Number of lines:"+lCount);
        System.out.println("Number of vowels:"+vCount);

    }
    public static int countVowels(String str)
    {
        int c = 0;
        String lowercase = str.toLowerCase();
        for (int i=0;i<str.length();i++)
        {
            char ch = lowercase.charAt(i);
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                c++;
            }
        }
        return c;
    }

}