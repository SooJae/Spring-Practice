package me.jerry.applicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class BookService {

//  @Autowired
  BookRepository bookRepository;
//
//  public BookService(BookRepository bookRepository) {
//    this.bookRepository = bookRepository;
//  }

  public void setBookRepository(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }
}
