package Lab06;

public class BookTest{
    public static void main(String[] args){
        Author deitel = new Author("deitel", "deitel@deitel.com");
        Book book1 = new Book("Java How to Program", deitel, "978-3-16-148410-0");
        System.out.printf("Book 1: %s\n", book1);
        System.out.println();
        
        Author none = new Author("none", "none@none");
        //LibraryBook book2 = new LibraryBook("None", deitel, "None", "unknown order");
        Book book2 = new Book("Java How to Program", deitel, "978-3-16-148410-0");
        book1 = book2;
        System.out.printf("Book 2: %s\n", book1);
        //book2.checkout("","");
        //book2.returned();
        System.out.println();
        
        Author summerville = new Author("Summerville", "summerville@summerville.com");
        book2 = new ReferenceBook("Software Enginnering", summerville, "0-87626-717-7", "100.100", "Science and Technology");
        book1 = book2;
        System.out.printf("Book 3: %s\n", book1);
        //book2.checkout("Donald Duck", "March 1, 2012");
        //book2.returned();
        System.out.println();
        
        Author walker = new Author("Henry M. Walker", "Walker@Walker.com");
        book2 = new CirculatingBook("Pascal:  Problem Solving and Structured Program Design", walker, "0-316-91848-2", "100.200");
        book1 = book2;
        System.out.printf("Book 4-1: %s\n\n", book1);
        //book2.checkout("Donald Duck", "March 1, 2012");
        System.out.printf("Book 4-2: %s\n\n", book1);
        //book2.returned();
        System.out.printf("Book 4-3: %s\n\n", book1);
        System.out.println();
    }
}
