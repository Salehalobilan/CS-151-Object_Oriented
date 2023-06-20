package Lab06;
public class LibraryTest {
    
    public static void main (String args[]) {
        
        Library lib = new Library (8);
        
        // set up library
        lib.addBook(new ReferenceBook ("Problems for Computer Solution using BASIC",
                                       new Author("Henry M. Walker", "walker@books.com"),
                                       "0-87626-717-7", "QA76.73.B3W335", "Iowa Room"));
        lib.addBook(new ReferenceBook ("Experiments in Java",
                                       new Author("Samuel A. Rebelsky", "Rebelsky@books.com"),
                                       "0201612674", "64.2 R25ex", "Iowa Room"));
        lib.addBook(new CirculatingBook ("Algorithms for functional programming",
                                         new Author("John David Stone", "stone@books.com"),
                                         "in process", "forthcoming"));
        lib.addBook(new CirculatingBook ("Computer Science 2:  Principles of Software Engineering, Data Types, and Algorithms",
                                         new Author("Henry M. Walker","walker@books.com"),
                                         "0-673-39829-3", "QA76.758.W35"));
        lib.addBook(new CirculatingBook ("Problems for Computer Solution using FORTRAN",
                                         new Author("John David Stone", "stone@books.com"),
                                         "0-87626-654-5", "QA43.W34"));
        lib.addBook(new CirculatingBook ("Introduction to Computing and Computer Science with Pascal",
                                         new Author("Henry M. Walker","walker@books.com"),
                                         "0-316-91841-5", "QA76.6.W3275"));
        lib.addBook(new CirculatingBook ("ED-MEDIA 2002 : World Conference on Educational Multimedia, Hypermedia & Telecommunications",
                                          new Author("Samuel A. Rebelsky", "Rebelsky@books.com"),
                                         "14. 1-880094-45-2", "64.2 25e"));
        lib.addBook(new CirculatingBook ("Pascal:  Problem Solving and Structured Program Design",
                                         new Author("Henry M. Walker","walker@books.com"),
                                         "0-316-91848-2", "QA76.73.P2W35"));
        lib.addBook(new CirculatingBook ("The Limits of Computing",
                                         new Author("Henry M. Walker","walker@books.com"),
                                         "0-7637-2552-8", "QA76.W185"));
        lib.addBook(new CirculatingBook ("The Tao of Computing",
                                         new Author("Henry M. Walker","walker@books.com"),
                                         "0-86720-206-8", "QA76.W1855"));
        
        // print library
        System.out.println(lib);
        
        // some users check out and return books
        lib.checkout("Donald Duck", "March 1, 2012", "QA43.W34");
        lib.checkout("Donald Duck", "March 12, 2012", "QA76.6.W3275");
        lib.checkout("Donald Duck", "March 6, 2012", "64.2 R25ex");
        lib.checkout("Minnie Mouse", "April 1, 2012", "64.2 25e");
        lib.checkout("Goofy", "February 28, 2012", "12345"); // should fail
        
        lib.returned("QA76.6.W3275");
        lib.returned("64.2 R25ex");
        
        lib.checkout("Goofy", "March 28, 2012", "QA76.6.W3275");
        
        // print final status of library
         System.out.println(lib);
    }
}
