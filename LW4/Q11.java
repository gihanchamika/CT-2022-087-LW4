import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = new Random().nextInt(100) + 1;
        int guess;
        System.out.println("Guess the number between 1 and 100:");
        do {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            if (guess < secret) System.out.println("Too low! Try higher.");
            else if (guess > secret) System.out.println("Too high! Try lower.");
            else System.out.println("Correct! The number was " + secret);
        } while (guess != secret);
    }
}
