package org.example.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Archive {
    private List<Book> books;
    private List<Megazine> megazines;

    public Archive() {
        this.books = new ArrayList<>();
        this.megazines = new ArrayList<>();
    }

}
