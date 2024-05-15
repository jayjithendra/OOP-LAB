import java.util.Scanner;

public class Additional5 {

    public static void generateThreeLetterWords(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    if (i != j && i != k && j != k) {
                        String threeLetterWord = "" + word.charAt(i) + word.charAt(j) + word.charAt(k);
                        System.out.println(threeLetterWord);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-letter word: ");
        String word = scanner.nextLine();

        if (word.length() != 5) {
            System.out.println("Error: Please enter exactly five letters.");
            return;
        }

        generateThreeLetterWords(word);
    }
}
