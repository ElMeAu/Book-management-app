import java.util.ArrayList;

    public class BookManager {
        private ArrayList<Book> books;
    
        public BookManager() {
            books = new ArrayList<>();
        }
    
        public void addBook(String title, String author) {
            Book book = new Book(title, author);
            books.add(book);
            System.out.println("Book added: " + book);
        }
    
        public void removeBook(String title) {
            if (books.removeIf(book -> book.title.equals(title))) {
                System.out.println("Book removed: " + title);
            } else {
                System.out.println("Book not found: " + title);
            }
        }
    
        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("There isnt any books");
            } else {
                System.out.println("All books:");
                for (Book book : books) {
                    System.out.println("Title: " + book.title + ", Author: " + book.author);
                }
            }
        }
    }

