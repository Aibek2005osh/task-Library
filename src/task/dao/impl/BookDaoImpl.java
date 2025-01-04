package task.dao.impl;

import task.dao.BookDao;
import task.models.Book;
import task.models.Datebase;
import task.models.Library;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    @Override
    public Book saveBook(Long libraryId, Book book) {

        for (Library l : Datebase.libraryList) {
            if (l.getId().equals(libraryId)) {
                l.getBooks().add(book);return book;
            }
        }
        throw  new IllegalArgumentException  ("not find library)"+libraryId) ;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        List<Book> books = new ArrayList<>();
        for (Library l : Datebase.libraryList) {
            if (l.getId().equals(libraryId)) {
                books.addAll(l.getBooks());
            }
        }
        return books;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        List<Book> books = getAllBooks(libraryId);

        if (books == null) {
            return null;
        }

        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return book;
            }
            else {
                System.out.println("not fount book");
            }
        }

return  null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        List<Book> allBooks = getAllBooks(libraryId);
        if (allBooks == null) {
                return null;
        }
        for (Book book : allBooks) {
            if (book.getId().equals(bookId)) {
                allBooks.remove(book);return "success delete book";
            }
        }

        return "not fount book";
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library library : Datebase.libraryList) {
            library.getBooks().removeIf(book -> book.getId().equals(libraryId));
            return;
        }
    }

}
