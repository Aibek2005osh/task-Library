package task.models;

import java.util.List;

public class Library {
    private Long id;
    private String name;
    private String address;
    private List<Book> books;
    private List<Reader> readers;

    private static Long genId = 1L;

    public Library() {
        this.id = genId++;
    }

    public Library( String name, String address, List<Book> books, List<Reader> readers) {
        this.id = genId++;
        this.name = name;
        this.address = address;
        this.books = books;
        this.readers = readers;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;

    }

    @Override
    public String toString() {
        return "     LIBRARY   \n" +
               "ID      : " + id +'\n'+
               "NAME    : " + name + '\n' +
               "ADDRESS : " + address + '\n' +
               "BOOKS   : " + books +'\n'+
               "READERS : " + readers +"\n\n";

    }
}

