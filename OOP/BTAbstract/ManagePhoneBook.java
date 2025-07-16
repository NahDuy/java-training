package BTAbstract;

import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("\nPHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameInsert = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phoneInsert = scanner.nextLine();
                    phoneBook.insertPhone(nameInsert, phoneInsert);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String nameRemove = scanner.nextLine();
                    phoneBook.removePhone(nameRemove);
                    break;
                case 3:
                    System.out.print("Enter name to update: ");
                    String nameUpdate = scanner.nextLine();
                    System.out.print("Enter new phone: ");
                    String newPhone = scanner.nextLine();
                    phoneBook.updatePhone(nameUpdate, newPhone);
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String nameSearch = scanner.nextLine();
                    phoneBook.searchPhone(nameSearch);
                    break;
                case 5:
                    phoneBook.sort();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
