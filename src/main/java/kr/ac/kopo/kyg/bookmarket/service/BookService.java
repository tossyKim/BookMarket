package kr.ac.kopo.kyg.bookmarket.service;
import kr.ac.kopo.kyg.bookmarket.domain.Book;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookByID(String bookID);
    List<Book> getBookListByCategory(String category);
    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
    Void setNewBook(Book book);
}
