/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalorant.library.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nguye
 */

//Class : Capitalize
//Service
public class Library {
    //Variable - lac da
    private static List<Book> list = new ArrayList<>();
    
    private static Scanner sc = new Scanner(System.in);
    
    public void addNewBookByConsole(){
        System.out.println("===== ADD NEW BOOK =====");
//      sc.nextLine();
        
        System.out.print("Please enter Book ID: ");
        String bookId = sc.nextLine();
        
        System.out.print("Please enter Book Name: ");
        String bookName = sc.nextLine();
        
        System.out.print("Please enter Author: ");
        String author = sc.nextLine();
        
        boolean isValidYear = false;
        String yearPublished;
        
        do{
            System.out.print("Please enter Year Published: ");
            yearPublished = sc.nextLine();
            isValidYear = isValidYear(yearPublished);
        }
        while(!isValidYear);   
        
        Book newBook = new Book(bookId, bookName, author, yearPublished);
        list.add(newBook);
        
        System.out.println("---> Add new book successfully!!!\n\n\n");
    }
    
    public void listAllBooks(){
        int count = 0;
        for(Book book : list){
            System.out.println(book);
            count++;
        }
        System.out.println("Total : " + count + " book(s)\n\n");
    }
    
    public void importBooks(String fileName){
        try{
            FileReader fr = new FileReader("src/main/java/javalorant/library/resources/" + fileName + ".txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] bookData = line.split(",");
                
                String bookId = bookData[0];
                String bookTitle = bookData[1];
                String bookAuthor = bookData[2];
                String yearPublished = bookData[3];
                
                Book book = new Book(bookId, bookTitle, bookAuthor, yearPublished);
                list.add(book);
            }
        }
        catch(IOException e){
            System.out.println("File doesn't exist\n\n");
        }
        finally{
            System.out.println("---> Import successfully!!!\n\n");
        }
    }
    
    public void searchBooks(){
        System.out.println("\n\n===== SEARCH BOOKS =====");
        System.out.println("1. Find by Book ID");
        System.out.println("2. Find by Book Name");
        System.out.println("3. Find by Book Author");
        System.out.println("4. Find by Year of Publishing");
        System.out.println("-----------------------------");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1 -> {
                findById();
                break;
            }
            case 2 -> {
                findByName();
                break;
            }
            case 3 -> {
                findByAuthor();
                break;
            }
            case 4 -> {
                findByYearPublishing();
                break;
            }
            default -> {
                searchBooks();
            }
        }
    }
    
    private static void findById(){
        System.out.print("Please enter Book ID : ");
        String id = sc.nextLine();
        boolean found = false;
        
        for(Book book : list){
            if(id.equals(book.getBookId())){
                System.out.println(book);
                found = true;
            }
        }
        
        if(found == false){
            System.out.println("---> No book was found!!!\n\n");
        }
        
        System.out.println("\n\n");
    }
    
    private static void findByName(){
        System.out.print("Please enter Book Title : ");
        String title = sc.nextLine();
        boolean found = false;
        
        for(Book book : list){
            if(title.equals(book.getTitle())){
                System.out.println(book);
                found = true;
            }
        }
        
        if(found == false){
            System.out.println("---> No book was found!!!\n\n");
        }
        
        System.out.println("\n\n");
    }
    
    private static void findByAuthor(){
        System.out.print("Please enter Book Author : ");
        String author = sc.nextLine();
        boolean found = false;
        
        for(Book book : list){
            if(author.equals(book.getAuthor())){
                System.out.println(book);
                found = true;
            }
        }
        
        if(found == false){
            System.out.println("---> No book was found!!!");
        }
        
        System.out.println("\n\n");
    }
    
    private static void findByYearPublishing(){
        
    }
    
    private boolean isValidYear(String year){
        int yearInt = Integer.parseInt(year);
        if(yearInt < 2023 && yearInt > 1800){
            return true;
        }
        return false;
    }
}
