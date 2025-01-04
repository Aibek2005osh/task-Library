package task.service.impl;

import task.dao.impl.BookDaoImpl;
import task.models.Book;
import task.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    BookDaoImpl bookDao = new BookDaoImpl();
    @Override
    public Book saveBook(Long libraryId, Book book) {
        return bookDao.saveBook(libraryId, book);
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        return bookDao.getAllBooks(libraryId);
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        return  bookDao.getBookById(libraryId, bookId);
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        return bookDao.deleteBook(libraryId, bookId);
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        bookDao.clearBooksByLibraryId(libraryId);

    }
}
