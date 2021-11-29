package com.example.librarysystem.service;

import com.example.librarysystem.models.Book;
import com.example.librarysystem.models.User;
import com.example.librarysystem.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllbooks(){
        return bookRepository.findAll();
    }

    public Book getBook(Long id){
        return bookRepository.getById(id);
    }

    public Book addBook(Book book){
      return bookRepository.save(book);
    }

    public Book updateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
