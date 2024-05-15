import java.util.Scanner;

class main {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the replacing word:");
        char r = sc.next().charAt(0);
        int len = s.length();
        char[] c = s.toCharArray();
        for (int i = 0; i < len; i++) {
            int found = 0;
            for (int j = i + 1; j < len; j++) {
                if (c[i] == c[j]) {
                    found = 1;
                    c[i] = c[j] = r;

                }

            }
        }
        String news = new String(c);
        System.out.println(" " + news);

    }
}