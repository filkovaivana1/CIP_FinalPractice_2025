package com.example.console;

import com.example.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LIbraryConsole implements CommandLineRunner {

    @Autowired
    private LibraryService libraryService;
    private Scanner scanner = new Scanner(System.in);

//    public LIbraryConsole(LibraryService libraryService) {
//        this.libraryService = libraryService;
//    }

    @Override
    public void run(String... args) {

        while (true) {
            System.out.println("Library menu:");
            System.out.println("1. Get available books");
            System.out.println("2. Add book");
            System.out.println("3. Reserve book");
            System.out.println("4. Exit");
            System.out.println("Enter option");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    libraryService.getAvailableBooks().forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
                    break;
                case 2:
                    System.out.println("Enter a title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter a author:");
                    String author = scanner.nextLine();

                    libraryService.addBook(title,author);
                    System.out.println("BOok added successfully");
                    break;
                case 3:
                    System.out.println("enter book title");
                    String bookTItle = scanner.nextLine();

                    if(libraryService.reserveBook(bookTItle)) {
                        System.out.println("Book reserved successfully");
                    } else {
                        System.out.println("Book not found or book already reserved");
                    }
                    break;
                case 4:
                    System.out.println("Exit application...");
                    return;
                default:
                    System.out.println("Invalid option");

            }

        }

    }

}
