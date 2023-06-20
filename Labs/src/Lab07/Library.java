package Lab07;
public class Library
{
    private LibraryBook[] books;
    private int bookCount;
    
    public Library(int booksNumber) {
        this.books = new LibraryBook[booksNumber];
    }
    
    public void addBook(LibraryBook book) {
        if (this.bookCount < this.books.length)
            this.books[this.bookCount++] = book;
        else
            System.out.println("Library is full. Cannot add more books!");
    }
    
    @Override
    public String toString() {
        String s = "\nListing of books in the library\n";
        for (LibraryBook book: this.books)
            if (book != null)
                s += "\n\t-" + book + "\n";
        s += "End of book listing\n";
        return s;
    }
    
    public LibraryBook findBook (String orderNumber) {
        for (LibraryBook book: this.books)
            if (book.getOrderNumber().equals(orderNumber))
                return book;
        
        return null;
    }
    
    public void checkout (String borrowerName, String dueDate, String orderNumber) {
        LibraryBook book = findBook(orderNumber);
        if (book == null)
            System.out.println ("Book " + orderNumber + " not found -- checkout impossible\n");
        else
            if (book instanceof Borrowable)
                ((Borrowable)book).checkout(borrowerName, dueDate);
            else
                System.out.println ("Book " + orderNumber + " not borrowable -- checkout impossible\n");
    }
    
    public void returned (String orderNumber) {
        LibraryBook book = findBook(orderNumber);
        if (book == null)
            System.out.println ("Book " + orderNumber + " not found -- return impossible\n");
        else
            if (book instanceof Borrowable)
                ((Borrowable)book).returned();
            else
                System.out.println ("Book " + orderNumber + " not borrowable -- return impossible\n");
    }
    
    public String getInfo(String orderNumber) {
        LibraryBook book = findBook(orderNumber);
        String infoStr = "";
        
        if (book != null)
            if (book instanceof ReferenceBook)
            {
                ReferenceBook refBook = (ReferenceBook) book;
                infoStr += "Collection: " + refBook.getCollection();
            } 
            else if (book instanceof CirculatingBook)
            {
                CirculatingBook cirBook = (CirculatingBook) book;
                infoStr += "borrower name: " + cirBook.getBorrowerName() + ", due date: " + cirBook.getDueDate();
            }

        return infoStr;
    }
    
}
