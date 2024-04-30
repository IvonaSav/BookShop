package project.bookshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.bookshop.model.Book;
import project.bookshop.service.BookService;

import java.util.List;


@Controller
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getBookPage(Model model){
        List<Book> books = this.bookService.listAll();
        model.addAttribute("books", books);
        return "listBooks";
    }
}
