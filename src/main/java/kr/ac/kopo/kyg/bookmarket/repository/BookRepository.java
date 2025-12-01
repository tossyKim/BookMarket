package kr.ac.kopo.kyg.bookmarket.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import kr.ac.kopo.kyg.bookmarket.domain.Book;

public interface BookRepository {

    List<Book> getAllBookList();
    List<Book> getBookListByCategory(String category);
    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
    Book getBookById(String bookId);
    void setNewBook(Book book);


}