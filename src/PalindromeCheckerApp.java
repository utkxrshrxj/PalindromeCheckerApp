import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("==============================");
        System.out.println("WELCOME");
        System.out.println("==============================");
        System.out.println("This Application checks whether a word is a palindrome or not");
        System.out.println("Stay Tuned for upcoming features!!!");

        String word = "madam";
        String reversed = " ";
        for (int i = word.length()-1;i>=0;i--){
            reversed = reversed + word.charAt(i);
        }
        System.out.println("\nChecking Word: "+word);
        if(word.equals(reversed)){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}