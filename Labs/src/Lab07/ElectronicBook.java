package Lab07;
public final class ElectronicBook extends SalableBook
{
    private final double size;
    private String downloadURL;

    public ElectronicBook(String title, Author author, String ISBN, double price, String category, double size, String downloadURL) {
        super(title, author, ISBN, price, category);
        this.size = size;
        this.downloadURL = downloadURL;
    }

    public double getSize() {
        return size;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    @Override
    public boolean isAvailable() {
        return (downloadURL!= null && !downloadURL.isEmpty() ); // or  !downloadURL.equals("")
    }
    
    @Override
    public double computeCost() {
        return getPrice() * getSize();
    }
    
    @Override
    public String toString() {
        return String.format("ElectronicBook[%s, size=%f, url=%s]", super.toString(), getSize(), getDownloadURL());
    }
}
