package com.example.librarysystem.repo;

import com.example.librarysystem.models.Book;
import com.example.librarysystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
