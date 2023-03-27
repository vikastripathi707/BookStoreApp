package com.mycompany.bookstore.converter;

import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.entity.BookEntity;

public class BookConverter {

    public static BookEntity convertBookDTOtoBookEntity(BookDTO bookDTO) {

        BookEntity be = new BookEntity();
        be.setAuthorEmail(bookDTO.getAuthorEmail());
        be.setAuthorName(bookDTO.getAuthorName());
        be.setAvailableQty(bookDTO.getAvailableQty());
        be.setBookId(bookDTO.getBookId());
        be.setDescription(bookDTO.getDescription());
        be.setName(bookDTO.getName());
        be.setPricePerQty(bookDTO.getPricePerQty());

        return be;
    }

    public static BookDTO convertBookEntitytoBookDTO(BookEntity bookEntity) {

        BookDTO bookDTO = new BookDTO();
        bookDTO.setAuthorEmail(bookEntity.getAuthorEmail());
        bookDTO.setAuthorName(bookEntity.getAuthorName());
        bookDTO.setAvailableQty(bookEntity.getAvailableQty());
        bookDTO.setBookId(bookEntity.getBookId());
        bookDTO.setDescription(bookEntity.getDescription());
        bookDTO.setName(bookEntity.getName());
        bookDTO.setPricePerQty(bookEntity.getPricePerQty());

        return bookDTO;
    }
}
