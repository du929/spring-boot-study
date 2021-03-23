package xyz.zfdu.boot.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@RestController
public class HelloController {
    @GetMapping(value = "hello")
    public String getHello() {
        return "hello spring boot";
    }

}
