package Lab06;
public class ReferenceBook extends LibraryBook
{
    private final String collection;

    public ReferenceBook(String title, Author author, String ISBN, String orderNumber, String collection) {
        super(title, author, ISBN, orderNumber);
        this.collection = collection;
    }

    public String getCollection() {
        return collection;
    }

    @Override
    public void checkout(String borrowerName, String dueDate) {
        System.err.println("Cannot check out a reference book!");
    }
    
    @Override
    public void returned() {
        System.err.println("Reference book could not have been checked out -- return impossible!");
    }
    
    @Override
    public String getStatus() {
         return "non-circulating reference book";
    }

    @Override
    public String toString() {
        return String.format("ReferenceBook[%s, collection=%s]", super.toString(), getCollection());
    }
}
