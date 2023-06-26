/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalorant.library.model;

/**
 *
 * @author nguye
 */

//Model
public class Book {
    private String bookId; //kieu lac da
    private String title;
    private String author;
    private String yearPublished;
    
    public Book(){
        
    }

    public Book(String bookId, String title, String author, String yearPublished) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" + "Book Id : " + bookId + ", Title : " + title + ", Author : " + author + ", Year Published : " + yearPublished + '}';
    }
}
