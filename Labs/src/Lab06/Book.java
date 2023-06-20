package Lab06;
public class Book 
{
   private final String title;
   private final Author author;
   private final String ISBN;
 
   public Book(String title, Author author, String ISBN) {
      this.title = title;
      this.author = author;
      this.ISBN = ISBN;
   }
 
   public String getTitle() {
      return title;
   }

   public Author getAuthor() {
      return author;
   }

   public String getISBN() {
      return ISBN;
   }
   
   @Override
   public String toString() {
       return String.format("Book[title=%s, author=%s, ISBN=%s]", getTitle(), getAuthor(), getISBN());
   }
}
