package com.mycompany.bookstore.repository.impl;

import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;
import com.mycompany.bookstore.serdeser.BookSerializer;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public Long add(BookEntity bookEntity) {
        BookSerializer.serializeBook(bookEntity);
        return bookEntity.getBookId();
    }

    @Override
    public BookEntity getDetail(Long bookId) {
        BookEntity be = BookSerializer.deSerializeBook(bookId);
        return be;
    }

}