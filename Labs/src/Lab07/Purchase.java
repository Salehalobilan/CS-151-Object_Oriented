package Lab07;
public class Purchase
{
    private Salable[] items;
    private int itemsCount;
    private String date;
    
    public Purchase(int itemsNumber, String date) {
        this.items = new Salable[itemsNumber];
        this.date = date;
    }
    
    public void addItem(Salable item) {
        if (this.itemsCount < this.items.length)
            this.items[this.itemsCount++] = item;
        else
            System.out.println("Purchase is full. Cannot add more items!");
    }
    
    @Override
    public String toString() {
        String s = "\nListing of items in the purchase ("+this.date+")\n";
        for (Salable item: this.items)
            if (item != null)
                s += "\n\t-" + item + "\n";
        s += "End of item listing\n";
        return s;
    }
    
    public Salable getItem (int index) {
        if (index >= 0 && index < items.length)
            return items[index];
        
        return null;
    }
    
    public double sumup () {
        double sum = 0;
        for(Salable i: items)
            sum += i.computeCost();
        return sum;
    }
    
    public String getInfo(int index) {
        Salable item = getItem(index);
        String infoStr = "";
        
        if (item != null)
            if (item instanceof PaperBook)
            {
                PaperBook paperBook = (PaperBook) item;
                infoStr += "weight: " + paperBook.getWeight() + ", quantity: " + paperBook.getQuantity();
            } 
            else if (item instanceof ElectronicBook)
            {
                ElectronicBook elecBook = (ElectronicBook) item;
                infoStr +=  "size: " + elecBook.getSize() + ", URL: " + elecBook.getDownloadURL();
            }

        return infoStr;
    }
    
}
