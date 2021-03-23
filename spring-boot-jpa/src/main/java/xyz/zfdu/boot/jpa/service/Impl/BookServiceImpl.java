package xyz.zfdu.boot.jpa.service.Impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.zfdu.boot.jpa.entity.Book;
import xyz.zfdu.boot.jpa.repository.BookRepository;
import xyz.zfdu.boot.jpa.service.BookService;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author zfdu
 * @description
 * @data 2021-03-18
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class BookServiceImpl implements BookService {
    @Resource
    private BookRepository bookRepository;


    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
