package Lab07;
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

    @Override
    public String toString() {
        return String.format("LibraryBook[%s, order number=%s]", super.toString(), getOrderNumber());
    }
}
