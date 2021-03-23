package xyz.zfdu.boot.jpa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.zfdu.boot.jpa.entity.Book;
import xyz.zfdu.boot.jpa.service.BookService;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author zfdu
 * @description
 * @data 2021-03-18
 */
@Controller
@RequestMapping(value = "/")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping()
    public String bookPage(Model model){
        model.addAttribute("message", "Hello SpringBoot");
        List<Book> bookList = bookService.getAll();
        model.addAttribute("bookList", bookList);
        return "book";

    }

}
