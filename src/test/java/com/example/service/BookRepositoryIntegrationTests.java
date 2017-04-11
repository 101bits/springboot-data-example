package com.example.service;

import com.example.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * SpringBootTest provides test features to load the beans into Application.
 * This is documented https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html
 * The repository does not wire up because the test class has no way to find the bean for it. This annotation
 * helps get the bean implementation in the test class.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryIntegrationTests {
    @Autowired
    BookRepository repository;

    @Test
    public void testAllBooks() throws Exception {
        List<Book> books = (List<Book>) repository.findAll();
        assertFalse(books.isEmpty());
        assertEquals(2, books.size());
    }

    @Test
    public void testFindByName() throws Exception {
        Book b1 = repository.findByName("B1");
        assertNotNull(b1);
        assertEquals("A1", b1.getAuthor());
    }
}
