package com.example.console;

import com.example.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class LibraryConsole implements CommandLineRunner {

        private LibraryService libraryService;
   private Scanner scanner = new Scanner(System.in);

    public LibraryConsole(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @Override
    public void run(String... args) {

       while(true){
        System.out.println("Library menu:");
        System.out.println("1. Get available books");
        System.out.println("2. Add book");
        System.out.println("3. Reserve book");
        System.out.println("4. Exit");
        System.out.println("Enter a option");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                libraryService.getAvailableBooks().forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
                break;
            case 2:
                System.out.println("Enter title: ");
                String title = scanner.nextLine();
                System.out.println("Enter author: ");
                String author = scanner.nextLine();
                libraryService.addBook(title, author);
                System.out.println("New book successfully added");
                break;
            case 3:
                System.out.println("Enter book title");
                String bookTitle = scanner.nextLine();

                if(libraryService.reserveBook(bookTitle)) {
                    System.out.println("Book reservation successfully");
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

}
