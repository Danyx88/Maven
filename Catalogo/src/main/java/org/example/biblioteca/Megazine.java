package org.example.biblioteca;

public class Megazine {
    private final String ISBN;
    private final String title;
    private final int ageP;
    private final int Npage;

    public Megazine(String ISBN, String title, int ageP, int npage) {
        this.ISBN = ISBN;
        this.title = title;
        this.ageP = ageP;
        this.Npage = npage;
    }

    @Override
    public String toString() {
        return "Megazine{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", ageP=" + ageP +
                ", Npage=" + Npage +
                '}';
    }
}
