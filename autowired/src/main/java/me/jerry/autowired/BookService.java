package me.jerry.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

  @Autowired
  List<BookRepository> bookRepositories;

  @Autowired
  public BookService(BookRepository bookRepository) {

  }
}
