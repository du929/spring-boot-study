package xyz.zfdu.boot.jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import xyz.zfdu.boot.jdbc.entity.Book;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */

@Repository
public class BookDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Book save(Book book) {
        String sql = "INSERT INTO t_article (author,title,content) VALUES  (?,?,?)";
        Object[] args = {book.getAuthor(),book.getTitle(),book.getContent()};
        int count = jdbcTemplate.update(sql, args);
        if(count == 1) {
            return book;
        } else {
            return null;
        }
    }
    /**
     * 根据id删除文章
     *
     * @param id id
     * @return int
     */
    public int deleteById(Integer id) {
        return jdbcTemplate.update("DELETE FROM t_article WHERE id = ?",id);
    }
    /** 更新文章
     *
     * @param
     * @return int
     */
    public int update(Book book) {
        return jdbcTemplate.update("UPDATE t_article SET author = ?, title = ? , content = ?, update_time = ? WHERE id = ?",
                book.getAuthor(),
                book.getTitle(),
                book.getContent(),
                book.getUpdateTime(),
                book.getId());
    }
    /** 根据id查找文章
     * @param id id
     * @return Book
     */
    public  Book findById(Integer id) {
        List<Book> books = jdbcTemplate.query("SELECT * FROM t_article WHERE id = ?",
                new Object[]{id}, new BeanPropertyRowMapper<>(Book.class));
        return books.get(0);
    }
    /** 查询所有文章
     *
     * @return List<Book>
     */
    public List<Book> findAll() {
        return jdbcTemplate.query("SELECT * FROM t_article ", new BeanPropertyRowMapper<>(Book.class));
    }
}
