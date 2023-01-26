package com.problemstatement1.bookmanipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookManipulationMain {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        Library lib=new Library();
        int i,choice;
        for(i=0;i<10;i++){
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books-by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice=s.nextInt();
            s.nextLine();
            if(choice==1){
                Book b=new Book();
                System.out.println("Enter the isbn no:");
               b.setIsbnNo(s.nextInt());
               s.nextLine();
                System.out.println("Enter the book name:");
                b.setBookName(s.nextLine());
                System.out.println("Enter the author name:");
                b.setAuthor(s.nextLine());
                lib.addBookInfo(b);
            }
            if(choice==2){
                List<Book> result=lib.viewAllBooks();
                if(result.isEmpty())
                {
                    System.out.println("The list is empty");
                    continue;
                }
                Iterator iter=result.iterator();
                while(iter.hasNext())
                {
                    Book b=(Book)iter.next();
                    System.out.println("Isbn No: "+b.getIsbnNo());
                    System.out.println("Book name:"+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if(choice==3){
                System.out.println("Enter the author name:");

                String name=s.nextLine();
                ArrayList<Book> result=lib.viewBooksByAuthor(name);
                if(result.isEmpty()){
                    System.out.println("None of the book published by the author "+name);
                    continue;
                }
                Iterator iter=result.iterator();
                while(iter.hasNext()){

                    Book b=(Book)iter.next();
                    System.out.println("Isbn no: "+b.getIsbnNo());
                    System.out.println("Book name: "+b.getBookName());
                    System.out.println("Author name: "+b.getAuthor());
                }
            }
            if(choice==4){
                System.out.println("Enter the book name");
                String name=s.nextLine();
                System.out.println("Count is "+lib.countNoOfBook(name));
            }
            if(choice==5)
                System.exit(0);
        }
    }
}