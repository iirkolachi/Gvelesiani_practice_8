import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the number:");
            int ricxvi1 = scanner.nextInt();
                System.out.println("The number you entered is integer: " + ricxvi1 + "!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please, enter an integer!");
        } finally {
            scanner.close();
        }
    }
}
