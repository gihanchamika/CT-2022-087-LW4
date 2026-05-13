import java.util.Scanner;

public class Q7 {
    public static int countDigits(int n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n > 0) { count++; n /= 10; }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int num = scanner.nextInt();
            if (num < 0) break;
            System.out.println("Number of digits: " + countDigits(num));
        }
    }
}
