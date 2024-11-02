import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            int ricxvi1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int ricxvi2 = scanner.nextInt();

            int ganayofi = ricxvi1 / ricxvi2;
            System.out.println("The division is: " + ganayofi);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            scanner.close();
        }
    }
}
