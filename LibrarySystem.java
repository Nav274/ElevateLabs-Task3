import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Want to add any book to the library (Y/N)");
        String isaddbook = sc.nextLine();
        
        if(isaddbook.equalsIgnoreCase("Y")) {
        	
        	System.out.println("Enter name of the book");
            String bookname = sc.nextLine();
            
            System.out.println("Enter name of the author of this book");
            String authorname = sc.nextLine();
            
            library.addBook(new Book(bookname, authorname));
        	
        }

        System.out.println("Want to add any new user (Y/N)");
        String isadduser = sc.nextLine();
        
        if(isadduser.equalsIgnoreCase("Y")) {
        	
        	System.out.println("Enter new username");
            String username = sc.nextLine();
            
            library.registerUser(new User(username));
        }
          
        System.out.println("Show Available Books (Y/N)");
        String isShowbooks = sc.nextLine();
        
        if(isShowbooks.equalsIgnoreCase("Y")) {
        	library.showBooks();
        }
        
        System.out.println("Show Available Users (Y/N)");
        String isShowusers = sc.nextLine();
        
        if(isShowusers.equalsIgnoreCase("Y")) {
        	library.showUsers();
        }
        
        System.out.println("Issue Book (Y/N)");
        String isIssuebooks = sc.nextLine();
        
        if(isIssuebooks.equalsIgnoreCase("Y")) {
        	
        	System.out.println("Enter Book name");
        	String bookname = sc.nextLine();
        	
        	System.out.println("Enter Author name");
        	String authorname = sc.nextLine();
        	
        	System.out.println("Enter Username of a user to be issued ");
        	String username = sc.nextLine();
        	
        	library.issueBook(bookname, authorname, username);
        }
        
        System.out.println("Return Book (Y/N)");
        String isReturnbooks = sc.nextLine();
        
        if(isReturnbooks.equalsIgnoreCase("Y")) {
        	
        	System.out.println("Book name");
        	String bookname = sc.nextLine();
        	
        	System.out.println("Author name");
        	String authorname = sc.nextLine();
        	
        	library.returnBook(bookname, authorname);
        }

    }
}
