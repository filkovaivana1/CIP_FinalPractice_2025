package com.example.console;

import com.example.model.Book;
import com.example.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class LibraryConsoleApp
//        implements CommandLineRunner
implements CommandLineRunner
{
 
   @Autowired
   private LibraryService libraryService;

   private Scanner scanner = new Scanner(System.in);

//   public LibraryConsoleApp(LibraryService libraryService) {
//      this.libraryService = libraryService;
//   }

   @Override
   public void run(String... args){
      while(true) {
         System.out.println("Library menu: ");
         System.out.println("1. Get available books");
         System.out.println("2. Add new book");
         System.out.println("3. Reserve a book");
         System.out.println("4. Exit");
         System.out.println("Choose an option: ");

         int choice = Integer.parseInt(scanner.nextLine());

         switch (choice) {
            case 1:
               libraryService.getAvailableBooks().forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
               break;
            case 2:
               System.out.println("Enter book title: ");
               String title = scanner.nextLine();
               System.out.println("Enter book author: ");
               String author = scanner.nextLine();
               libraryService.addBook(title, author);               
               break;

            case 3:
               System.out.println("Enter title to reserve: ");
               String bookTitle = scanner.nextLine();
               if (libraryService.reserveBook(bookTitle)) {
                  System.out.println("Book successfully reserved");
               } else {
                  System.out.println("Book not found or already reserved");
               }
               break;

            case 4:
               System.out.println("Exiting application...");
               return;

            default:
               System.out.println("Invalid option");
         }
      }
   }

   //    private final LibraryService libraryService;
//    private final Scanner scanner = new Scanner(System.in);

//    public LibraryConsoleApp(LibraryService libraryService) {
//        this.libraryService = libraryService;
//    }

//    @Override
//    public void run(String... args) {
//        while (true) {
//            System.out.println("\nLibrary Menu:");
//            System.out.println("1. List available books");
//            System.out.println("2. Add a new book");
//            System.out.println("3. Reserve a book");
//            System.out.println("4. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    libraryService.getAvailableBooks().forEach(
//                            book -> System.out.println(book.getTitle() + " by " + book.getAuthor())
//                    );
//                    break;
//                case 2:
//                    System.out.print("Enter book title: ");
//                    String title = scanner.nextLine();
//                    System.out.print("Enter author name: ");
//                    String author = scanner.nextLine();
//                    libraryService.addBook(title, author);
//                    System.out.println("Book added successfully!");
//                    break;
//                case 3:
//                    System.out.print("Enter book title to reserve: ");
//                    String bookTitle = scanner.nextLine();
//                    if (libraryService.reserveBook(bookTitle)) {
//                        System.out.println("Book reserved!");
//                    } else {
//                        System.out.println("Book not found or already reserved.");
//                    }
//                    break;
//                case 4:
//                    System.out.println("Exiting application...");
//                    return;
//                default:
//                    System.out.println("Invalid choice. Try again.");
//            }
//        }
//    }
}