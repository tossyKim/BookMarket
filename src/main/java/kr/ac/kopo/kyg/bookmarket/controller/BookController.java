package kr.ac.kopo.kyg.bookmarket.controller;

import kr.ac.kopo.kyg.bookmarket.domain.Book;
import kr.ac.kopo.kyg.bookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping
    public String requestAllBookList(Model model) {
        List<Book> bookList = bookService.getAllBookList();
        model.addAttribute("bookList", bookList);
        return "books";
    }
    @RequestMapping("/all")
    public ModelAndView requestAllBookList1(Model model) {
        ModelAndView modelV = new ModelAndView();
        modelV.setViewName("books");
        List<Book> bookList = bookService.getAllBookList();
        modelV.addObject("bookList", bookList);
        return modelV;
    }

    @RequestMapping("/book")
    public String requestAllParam(@RequestParam("id") String BookId, Model model) {
        Book book = bookService.getBookByID(BookId);
        model.addAttribute("book", book);
        return "book";
    }

    @GetMapping("/{category}")
    public String requestBooksByCategory(@PathVariable("category")String category, Model model) {
        List<Book> bookbyCategory = bookService.getBookListByCategory(category);
        model.addAttribute("bookList", bookbyCategory);
        return "books";
    }
    @GetMapping("/filter/{bookFilter}")
    public String requestBooksByFilter(@MatrixVariable(pathVar = "bookFilter")Map<String, List<String>> bookFilter, Model model) {
        Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
        model.addAttribute("bookList", booksByFilter);
        return "books";
    }
}
