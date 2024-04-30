package project.bookshop.service.impl;

import org.springframework.stereotype.Service;
import project.bookshop.repository.BookRepository;
import project.bookshop.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
