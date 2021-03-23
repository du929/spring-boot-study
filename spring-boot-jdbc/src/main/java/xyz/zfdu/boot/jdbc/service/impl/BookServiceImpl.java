package xyz.zfdu.boot.jdbc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.zfdu.boot.jdbc.dao.BookDao;
import xyz.zfdu.boot.jdbc.entity.Book;
import xyz.zfdu.boot.jdbc.service.BookService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDAO;

    @Override
    public boolean postBook(Book book) {
        Book saveBook = bookDAO.save(book);
        int a = 3/0;
        System.out.println(a);
        return saveBook != null;
    }



    @Override
    public boolean deleteBook(int id) {
        int row = bookDAO.deleteById(id);
        return row != 0;
    }


    @Override
    public boolean updateBook(Book book) {
        int row = bookDAO.update(book);
        return row != 0;
    }

    @Override
    public Book getById(int id) {
        Book book = bookDAO.findById(id);
        return book;
    }

    @Override
    public List<Book> getAll() {
        return bookDAO.findAll();
    }
}
