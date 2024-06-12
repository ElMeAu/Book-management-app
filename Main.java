import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Book management app");
            System.out.println("1.Add a Book");
            System.out.println("2.Remove a Book");
            System.out.println("3.Show All Books");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                manager.addBook(title, author);
            } else if (choice == 2) {
                System.out.print("Enter title of the book to remove: ");
                String title = scanner.nextLine();
                manager.removeBook(title);
            } else if (choice == 3) {
                manager.displayBooks();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
