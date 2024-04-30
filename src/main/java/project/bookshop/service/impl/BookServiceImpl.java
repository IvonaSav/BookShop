package project.bookshop.service.impl;

import org.springframework.stereotype.Service;
import project.bookshop.model.Book;
import project.bookshop.repository.BookRepository;
import project.bookshop.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> listAll() {
        return bookRepository.findAll();
    }
}
