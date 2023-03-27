package com.mycompany.bookstore.service.impl;

import com.mycompany.bookstore.converter.BookConverter;
import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;
import com.mycompany.bookstore.repository.impl.BookRepositoryImpl;
import com.mycompany.bookstore.service.BookService;

public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    public BookServiceImpl() {
        this.bookRepository = new BookRepositoryImpl();
    }

    @Override
    public Long add(BookDTO bookDTO) {
        //Convert the DTO to Repository compatible Entity class
        //Adapter Design Pattern
        BookEntity bookEntity = BookConverter.convertBookDTOtoBookEntity(bookDTO);
        return this.bookRepository.add(bookEntity);
    }

    @Override
    public BookDTO getBook(Long bookId) {
        //Convert the Entity to Service compatible DTO class
        //Adapter Design Pattern
        BookEntity bookEntity = this.bookRepository.getDetail(bookId);
        BookDTO bookDTO = BookConverter.convertBookEntitytoBookDTO(bookEntity);
        return bookDTO;
    }

}