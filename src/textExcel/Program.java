// Garrett Wayne

package textExcel;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Keep this as the first statement in main
        Spreadsheet sheet = new Spreadsheet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TextExcel!!!\n");

        // Read in the first command
        String command = getCommand(scanner);

        // Loop until user enters 'exit'
        while (!command.toLowerCase().equals("exit"))
        {
            System.out.println(sheet.processCommand(command));
            command = getCommand(scanner);
        }

        System.out.println("\nGoodbye, Thank you for using TextExcel");
        scanner.close();
    }

    private static String getCommand(Scanner scanner) {
        System.out.print("Enter a command: ");

        return scanner.nextLine().trim();
    }
}
