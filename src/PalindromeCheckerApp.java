import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("      PALINDROME CHECKER       ");
        System.out.println("=====================================");
        System.out.println("This Application checks whether a word is a palindrome or not");
        System.out.print("Enter a word: ");

        String word = scanner.nextLine();

        char[] characters = word.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}