package com.example;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created so that I can see data on http://localhost:8080/
 */

@Controller
public class BooksController {

    private BookService bookService;

    public BooksController(@Autowired final BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
