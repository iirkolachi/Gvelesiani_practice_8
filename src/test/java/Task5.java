import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println("Enter the number:");
            int number = scanner.nextInt(); /*თუ აქ გადავცემთ 5-ს ან მეტს, დაარტყამს ArrayIndexOutOfBoundsException,
            ხოლო თუ გადავცემთ 0-ს, დაარტყამს ArithmeticException*/
            int fixedNumber = 70;

            System.out.println("Array element: " + array[number]);
            int division = fixedNumber / number; /*fixed number-ად ასევე შესაძლებელია ერეიდან აღებული ელემენტის გამოყენება:
            int division = array[number] / number; */
            System.out.println("Division is: " + division);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            scanner.close();
        }
    }
}
