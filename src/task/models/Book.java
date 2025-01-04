package task.models;

import task.enums.Ganre;
import task.enums.Gender;

public class Book {
private Long id;
private String name;
private String author;
private Ganre ganre;

private static Long bookId = 1L;

public Book() {
    this.id = bookId++;

}

    public Book( String name, String author, Ganre gender) {
        this.id = bookId++;
        this.name = name;
        this.author = author;
        ganre = gender;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Ganre getGanre() {
        return ganre;
    }

    public void setGanre(Ganre ganre) {
        this.ganre = ganre;
    }

    @Override
    public String toString() {
        return "      BOOK \n" +
               "ID     : " + id + '\n' +
               "NAME   : '" + name + '\n' +
               "AUTHOR : " + author + '\n' +
               "GANRE  : " + ganre + "\n\n";
    }
}
