package com.example.librarysystem.controllers;

import com.example.librarysystem.models.Book;
import com.example.librarysystem.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books/api")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.getAllbooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
   @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id){
        Book book = bookService.getBook(id);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }

    @PutMapping("/book/update")
    public ResponseEntity<Book>  updateBook(@RequestBody Book book){
        Book updateBook = bookService.updateBook(book);
        return new ResponseEntity<>(updateBook,HttpStatus.OK);
    }

    @PostMapping("/book/add")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
       Book newBook = bookService.addBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
