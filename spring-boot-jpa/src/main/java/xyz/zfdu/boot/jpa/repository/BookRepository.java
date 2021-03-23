package xyz.zfdu.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.zfdu.boot.jpa.entity.Book;


/**
 * @author zfdu
 * @description
 * @data 2021-03-18
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
}
