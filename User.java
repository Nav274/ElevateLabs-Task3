import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    

    @Override
    public String toString() {
        return "User: " + name + ", Borrowed Books: " + borrowedBooks.size();
    }
}
