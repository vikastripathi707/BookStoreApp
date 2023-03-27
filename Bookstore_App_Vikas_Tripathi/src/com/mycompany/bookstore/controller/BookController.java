package com.mycompany.bookstore.controller;

import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.service.BookService;
import com.mycompany.bookstore.service.impl.BookServiceImpl;

public class BookController {

    private BookService bookService;

    public BookController() {
        //Dynamic/Runtime polymorphism
        this.bookService = new BookServiceImpl();
    }

    public Long add(BookDTO bookDTO) {
        //Call to the Service layer add method
        return this.bookService.add(bookDTO);
    }

    public BookDTO getBook(Long bookId) {
        //Call to the Service layer get book method and return the book dto object
        return this.bookService.getBook(bookId);
    }
}