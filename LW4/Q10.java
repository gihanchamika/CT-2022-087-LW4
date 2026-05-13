import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed))
            System.out.println("It is a Palindrome!");
        else
            System.out.println("It is NOT a Palindrome.");
    }
}
