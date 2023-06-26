/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalorant.library.view;

import java.util.Scanner;
import javalorant.library.model.Library;

/**
 *
 * @author nguye
 */

//Controller
public class LibraryManagement {
    //Instance
    private static Library library = new Library();
    
    public void addNewBookByConsole(){
        library.addNewBookByConsole();
    }
    
    public void listAllBooks(){
        library.listAllBooks();
    }
    
    public void importBooks(String fileName){
        library.importBooks(fileName);
    }
    
    public void searchBooks(){
        library.searchBooks();
    }
}
