package Lab07;
public class PurchaseTest {
    public static void main(String[] args) {
        Purchase purchase = new Purchase (5, "1/7/1439");
        
        // set up purcahse
        purchase.addItem(new PaperBook ("Problems for Computer Solution using BASIC",
                                       new Author("Henry M. Walker", "walker@books.com"),
                                       "0-87626-717-7", 120.0, "Problem Solving", 0.135, 2));
        purchase.addItem(new PaperBook ("Experiments in Java",
                                       new Author("Samuel A. Rebelsky", "Rebelsky@books.com"),
                                       "0201612674", 170.0, "Programming", 0.2, 1));
        purchase.addItem(new PaperBook ("Algorithms for functional programming",
                                         new Author("John David Stone", "stone@books.com"),
                                   "0-46676-352-4", 60, "Algorithms", 0.1, 3));
        purchase.addItem(new ElectronicBook ("Computer Science 2:  Principles of Software Engineering, Data Types, and Algorithms",
                                         new Author("Henry M. Walker","walker@books.com"),
                                        "0-673-39829-3", 99, "Software Engineering", 3, "http://books.com/se_walkers.pdf"));
        purchase.addItem(new ElectronicBook ("Problems for Computer Solution using FORTRAN",
                                         new Author("John David Stone", "stone@books.com"),
                                        "0-87626-654-5", 40, "Programming", 1, "http://books.com/fortran.pdf"));
        purchase.addItem(new ElectronicBook ("Introduction to Computing and Computer Science with Pascal",
                                         new Author("Henry M. Walker","walker@books.com"),
                                        "0-316-91841-5", 87, "Problem Solving", 2, "http://books.com/pascal.pdf"));
       
        
        // print purchases
        System.out.println(purchase);
        
        // print sum of purchase
        System.out.println("Purchase sumup: " + purchase.sumup());
        
        
        // print specific information from books
        System.out.println(purchase.getInfo(1));
        System.out.println(purchase.getInfo(4));
    }
}
