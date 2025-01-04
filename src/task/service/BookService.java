package task.service;
import java.util.List;
import task.models.Book;
public interface BookService {
    Book saveBook(Long libraryId,Book book);

    List<Book>getAllBooks(Long libraryId);

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    void clearBooksByLibraryId(Long libraryId);
}
