package com.example.bookstores.repository;

import com.example.bookstores.entities.Book;
import com.example.bookstores.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByCategory(Category category);

    List<Book> findByPriceBetween(Double minPrice, Double maxPrice);

    List<Book> findBooksByTitleContainingIgnoreCase(String keyword);
}
