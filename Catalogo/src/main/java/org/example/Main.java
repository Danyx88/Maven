package org.example;

import org.example.biblioteca.Book;
import org.example.biblioteca.Megazine;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main( String[] args ) {
        Faker faker = new Faker();

        List<Book> books = new ArrayList<>();
        List<Megazine> megazines = new ArrayList<>();

        for(int i=0; i<10; i++){
             String ISBN = faker.code().isbn10();
             String title = faker.book().title();
             int ageP = faker.number().numberBetween(1400, 2020);
             int Npage = faker.number().numberBetween(20,1500);
             String author = faker.book().author();
             String genre = faker.book().genre();

             Book book = new Book(ISBN, title, ageP, Npage, author, genre);
             books.add(book);
        }

        for(int i=0; i<10; i++){
             String ISBN = faker.code().isbn10();
             String title = faker.book().title();
             int ageP = faker.number().numberBetween(1400, 2020);
             int Npage = faker.number().numberBetween(20,1500);

             Megazine megazine = new Megazine(ISBN, title, ageP, Npage);
             megazines.add(megazine);
        }

        for (Book book : books){
            System.out.println(book);
        }

        for (Megazine megazine : megazines){
            System.out.println(megazine);
        }

    }
}
