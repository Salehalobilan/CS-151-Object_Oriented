package Lab07;
public interface Borrowable
{
    void checkout(String borrowerName, String dueDate);
    void returned();
    String getStatus();
}
