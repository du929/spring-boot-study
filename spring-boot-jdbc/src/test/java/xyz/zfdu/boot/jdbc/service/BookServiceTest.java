package xyz.zfdu.boot.jdbc.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.zfdu.boot.jdbc.entity.Book;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Slf4j
@SpringBootTest
class BookServiceTest {

    @Resource
    private BookService bookService;
    @Test
    void postBook() {
        Book book = Book.builder()
                .title("test")
                .content("test")
                .author("dd")
                .build();
        log.info("book" + book);
        boolean flag = bookService.postBook(book);
        log.info("flag" + flag);
        assertTrue(flag);
    }

    @Test
    void selectAll(){
        List<Book> books = bookService.getAll();
        assertEquals(2,books.size());
        books.forEach(System.out::println);
    }
    @Test
    void delete() {
        boolean flag = bookService.deleteBook(3);
        assertTrue(flag);
    }
    @Test
    void findById() {
        Book realBook = bookService.getById(1);
        Book expectedBook = Book.builder()
                .title("WQ2")
                .content("tR")
                .author("DD")
                .updateTime(new Date())
                .build();
        log.info("expectedBook-----" + expectedBook);
        assertEquals(expectedBook,realBook);
    }
    @Test
    void update(){
        Book book = Book.builder()
                .id(1)
                .title("WQ2")
                .content("tR")
                .author("DD")
                .updateTime(new Date())
                .build();
        boolean flag = bookService.updateBook(book);
        assertTrue(flag);
    }

}