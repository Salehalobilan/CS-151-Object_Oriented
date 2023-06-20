package Lab07;
public final class ReferenceBook extends LibraryBook
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
    public String toString() {
        return String.format("ReferenceBook[%s, collection=%s]", super.toString(), getCollection());
    }
}
