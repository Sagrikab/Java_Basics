package com.problemstatement1.bookmanipulation;

import java.util.*;

public class Library {

    private List<Book> bookList=new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public void addBookInfo(Book obj){
        bookList.add(obj);
    }
    public List<Book> viewAllBooks(){
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author){
    ArrayList<Book> authorName=new ArrayList<>();
        Iterator iterator=bookList.iterator();
        while (iterator.hasNext()){
            Book bk=(Book) iterator.next();
            if(bk.getAuthor().equalsIgnoreCase(author))
                authorName.add(bk);
        }
        return authorName;
    }

    public int countNoOfBook(String bookName){
        int count=0;
        Iterator it=bookList.iterator();
        while (it.hasNext()){
            Book book=(Book)it.next();
            if(book.getBookName().equalsIgnoreCase(bookName))
                count++;
        }
        return count;
    }
}
