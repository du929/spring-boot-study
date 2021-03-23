package xyz.zfdu.boot.jpa.service;

import xyz.zfdu.boot.jpa.entity.Book;

import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-18
 */
public interface BookService {
    /**
     *  新增book
     * @param  book 入参
     * @return 新增的book对象
     */
    Book save(Book book);

    /**
    * 查询所有book
    *
    * @return 图书集合
    *
    */
    List<Book> getAll();
}
