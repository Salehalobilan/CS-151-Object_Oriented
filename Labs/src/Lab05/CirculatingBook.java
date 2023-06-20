package Lab05;
public class CirculatingBook extends LibraryBook
{
    private String borrowerName;
    private String dueDate;

    public CirculatingBook(String title, Author author, String ISBN, String orderNumber) {
        super(title, author, ISBN, orderNumber);
    }

    public String getBorrowerName() {
        return borrowerName;
    }
    
    public String getDueDate() {
        return dueDate;
    }

    @Override
    public void checkout(String borrowerName, String dueDate) {
        this.borrowerName = borrowerName;
        this.dueDate = dueDate;
    }
    
    @Override
    public void returned() {
        borrowerName = dueDate = null;
    }
    
    @Override
    public String getStatus() {
         if (borrowerName != null)
             return String.format("borrower name: %s, due date: %s", borrowerName, dueDate);
        else
            return "book available on shelves";
    }
    
    @Override
    public String toString() {
        return String.format("CirculatingBook[%s%s]", super.toString(),
                             borrowerName == null ? "" : ", "+getStatus());
    }
}
