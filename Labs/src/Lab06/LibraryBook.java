package Lab06;
public abstract class LibraryBook extends Book
{
    private final String orderNumber;

    public LibraryBook(String title, Author author, String ISBN, String orderNumber) {
        super(title, author, ISBN);
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void checkout(String borrowerName, String dueDate) {
        System.out.println("Unknown book! Cannot checkout!");
    }
    
    public void returned() {
        System.out.println("Unknown book! Cannot returned!");
    }
    
    public String getStatus() {
         System.out.println("Unknown book! Cannot get status!");
        return "";
    }

    @Override
    public String toString() {
        return String.format("LibraryBook[%s, order number=%s, status=%s]", super.toString(), getOrderNumber(), getStatus());
    }
}
