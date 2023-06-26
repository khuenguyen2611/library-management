/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalorant.library.view;

import java.util.Scanner;

/**
 *
 * @author nguye
 */

//View
public class Menu {
    //Instace cua LibraryManagement
    private static LibraryManagement libraryManagement = new LibraryManagement();
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add new book by console");
            System.out.println("2. Import new books");
            System.out.println("3. List all books");
            System.out.println("4. Search book");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 -> {
                    libraryManagement.addNewBookByConsole();
                    break;
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.print("Enter the file name in resource folder: ");
                    libraryManagement.importBooks(sc.nextLine());
                    break;
                }
                case 3 -> {
                    libraryManagement.listAllBooks();
                    break;
                }
                case 4 -> {
                    libraryManagement.searchBooks();
                    break;
                }
                case 5 -> {
                    System.out.println("Thank for choosing us");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Thank for choosing us");
                }
            }
        }
        while(choice > 0 && choice < 6);
    }
}
