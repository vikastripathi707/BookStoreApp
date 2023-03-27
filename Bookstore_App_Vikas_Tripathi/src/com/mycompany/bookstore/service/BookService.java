package com.mycompany.bookstore.service;

import com.mycompany.bookstore.dto.BookDTO;

public interface BookService {

    public Long add(BookDTO bookDTO);
    public BookDTO getBook(Long bookId);
}