import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] ricxvebi = {1, 2, 3, 4, 5};
            System.out.println("Array element: " + ricxvebi[2]); /*როცა ინდექსში გადავცემთ 5-ს ან მეტს,
            დაარტყამს ArrayIndexOutOfBoundsException */

            String teqsti = null;
            System.out.println(teqsti.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("String variable is null!");
        } finally {
            scanner.close();
        }
    }
}