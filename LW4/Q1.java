import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int smallest;
        if (a <= b && a <= c) smallest = a;
        else if (b <= a && b <= c) smallest = b;
        else smallest = c;
        System.out.println("Smallest integer: " + smallest);
    }
}
