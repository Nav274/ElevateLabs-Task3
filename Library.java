import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " registered successfully.");
    }

    public void showBooks() {
    	if(books.isEmpty()) {
    		System.out.println("no book present");
    	}
    	else {
    		for (Book book : books) {
                System.out.println(book);
            }
    	}
        
    }
    
    public void showUsers() {
    	if(users.isEmpty()) {
    		System.out.println("no user present");
    	}
    	else {
    		for (User user : users) {
                System.out.println(user);
            }	
    	}
    
    }

    private User findUser(String name) {
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }
        }
        return null;
    }

    public void issueBook(String title, String authorName, String username) {
        Book authorbook = findAuthor(authorName);
        if (authorbook == null) {
            System.out.println("Book not found: ");
            return;
        }
      
        User user = findUser(username);
        
        if(user==null) {
        	System.out.println("user not found");
        	return;
        }
        
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                user.borrowBook(book);
                System.out.println(user.getName() + " issued " + title + "by" + authorName);
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    private Book findAuthor(String authorname) {
		for(Book book : books) {
			if(book.getAuthor().equalsIgnoreCase(authorname)) {
				return book;
			}
		}
		return null;
	}

	public void returnBook(String title, String userName) {
        User user = findUser(userName);
        if (user == null) {
            System.out.println("User not found: " + userName);
            return;
        }

        for (Book book : user.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                user.returnBook(book);
                System.out.println(user.getName() + " returned " + title);
                return;
            }
        }
        System.out.println(user.getName() + " does not have " + title);
    }
}
