package Tet8;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;

   public static void main(String[] args)
   {
       openFile();
       readRecords();
       closeFile();
   } 

   // open file clients.txt
   public static void openFile()
   {
         //input = new Scanner(Paths.get("clients.txt"));
   }

   // read record from file
   public static void readRecords()
   {
      System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
         "First Name", "Last Name", "Balance");

     
      while (input.hasNext()) // while there is more to read
      {
         // display record contents
         System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
           input.next(), input.next(), input.nextDouble());
      }
   } // end method readRecords

   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
   } 
} // end class ReadTextFile