package xyz.zfdu.boot.jdbc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.zfdu.boot.jdbc.controller.dto.AjaxResponse;
import xyz.zfdu.boot.jdbc.controller.dto.Param;
import xyz.zfdu.boot.jdbc.entity.Book;
import xyz.zfdu.boot.jdbc.entity.BookReader;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@RestController
@RequestMapping(value = "/api/v1/books")
@Slf4j
@Validated
public class BookController {

    @GetMapping("all")
    public AjaxResponse selectBooks() {
        BookReader[] readers = {
                BookReader.builder()
                        .name("aaa")
                        .age(20)
                        .build(),
                BookReader.builder()
                        .name("bbb")
                        .age(19)
                        .build(),
        };
        List<BookReader> readerList = Arrays.asList(readers);
        Book book1 = Book.builder()
                .id(123)
                .author("zfdu")
                .title("SpringBoot")
                .content("SpringBoot从入门到精通")
                .updateTime(new Date())
                .readers(readerList)
                .build();
        Book book2 = Book.builder()
                .id(456)
                .author("zfdu")
                .title("Vue.js")
                .content("Vue.js从入门到精通")
                .updateTime(new Date())
                .readers(readerList)
                .build();

        Book[] books = {book1, book2};
        List<Book> bookList = Arrays.asList(books);

        return AjaxResponse.success(bookList);
    }

    @GetMapping("{id}")
    public AjaxResponse getBook(@PathVariable int id) {
        Book book = Book.builder()
                .id(id)
                .author("zfdu")
                .title("Java")
                .content("Java从入门到精通")
                .updateTime(new Date())
                .build();
        return AjaxResponse.success(book);
    }

    @PostMapping()
    public AjaxResponse saveBook(@RequestBody Book book) {
        log.info("saveBook:" + book);
        return AjaxResponse.success();
    }

    @PutMapping()
    public AjaxResponse updateBook(@RequestBody Book book) {
        Book book1 = Book.builder()
                .id(111)
                .author("zfdu")
                .title("Java")
                .content("Java从入门到精通")
                .updateTime(new Date())
                .build();
        log.info("book:" + book);

        book1.setId(book.getId());
        book1.setTitle(book.getTitle());

        log.info("book:" + book);
        return AjaxResponse.success(book1);


    }

    @DeleteMapping()
    public AjaxResponse deleteBook(@RequestBody Param param) {

        log.info("id:" + param.getId());
        log.info(("title" + param.getTitle()));
        return AjaxResponse.success(param);
    }

}