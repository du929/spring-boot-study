package xyz.zfdu.boot.config.entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class StudentTest {
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    public void testLoadStudent() {
        boolean flag = ioc.containsBean("student");
        assertTrue(flag);
        Student expectedStudent = Student.builder().id(123).name("Tom").build();
        Student student = (Student) ioc.getBean("student");
        assertEquals(expectedStudent,student);
    }



}