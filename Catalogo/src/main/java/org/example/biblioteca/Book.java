package org.example.biblioteca;


public class Book {
    private final String ISBN;
    private final String title;
    private final int ageP;
    private final int Npage;
    private final String author;
    private final String genre;

    public Book(String ISBN, String title, int ageP, int npage, String author, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.ageP = ageP;
        this.Npage = npage;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", ageP=" + ageP +
                ", Npage=" + Npage +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
