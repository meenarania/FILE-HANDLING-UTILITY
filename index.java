import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class FileHandlingUtility {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== FILE HANDLING UTILITY =====");
            System.out.println("1. Create & Write File");
            System.out.println("2. Read File");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    writeFile();
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void writeFile() {
        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            FileWriter writer = new FileWriter(fileName);
            System.out.print("Enter content: ");
            String content = sc.nextLine();

            writer.write(content);
            writer.close();

            System.out.println("File written successfully.");

        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }

    static void readFile() {
        try {
            System.out.print("Enter file name to read: ");
            String fileName = sc.nextLine();

            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\n--- File Content ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}
