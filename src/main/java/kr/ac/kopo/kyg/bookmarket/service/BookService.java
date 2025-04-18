package kr.ac.kopo.kyg.bookmarket.service;
import kr.ac.kopo.kyg.bookmarket.domain.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBookList();
    Book getBookByID(String bookID);

    List<Book> getBookListByCategory(String category);
}
