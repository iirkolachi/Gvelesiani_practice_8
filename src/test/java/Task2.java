import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            File file = new File("data.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String failisTeqsti = scanner.nextLine();
                System.out.println(failisTeqsti);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure data.txt exists in the directory.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}