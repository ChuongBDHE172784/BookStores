package com.example.bookstores.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "khong duoc de trong")
    private String title;

    private String author;
    @Min(value = 1, message = "price need to >0")
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryName;
}
