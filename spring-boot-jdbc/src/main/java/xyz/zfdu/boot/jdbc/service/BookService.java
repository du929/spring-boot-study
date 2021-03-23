package xyz.zfdu.boot.jdbc.service;

import xyz.zfdu.boot.jdbc.entity.Book;

import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
public interface BookService {
    /**
     * 发布文章
     *
     * @param
     * @return
     */
    boolean postBook(Book book);

    boolean deleteBook(int id);

    boolean updateBook(Book book);

    Book getById(int id);

    List<Book> getAll();
}
