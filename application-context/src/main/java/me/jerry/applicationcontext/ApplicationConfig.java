package me.jerry.applicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackageClasses = ApplicationContextApplication.class)
public class ApplicationConfig {
//  @Bean
//  public BookRepository bookRepository(){
//    return new BookRepository();
//  }
//
//  @Bean
//  public BookService bookService(BookRepository bookRepository){
//    BookService bookService = new BookService();
//    bookService.setBookRepository(bookRepository());
//    return bookService;
//  }
}
