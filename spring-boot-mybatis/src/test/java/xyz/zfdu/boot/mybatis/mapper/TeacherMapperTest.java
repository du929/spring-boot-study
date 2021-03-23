package xyz.zfdu.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import xyz.zfdu.boot.mybatis.domain.Teacher;

import javax.annotation.Resource;

import java.util.List;


/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {
    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void selectAll() {
        List<Teacher> teacherList = teacherMapper.selectAll();
        System.out.println(teacherList);
    }

    @Test
    void findAll() {
        List<Teacher> teacherList = teacherMapper.findAll();
        System.out.println(teacherList);
    }
    @Test
    void insertTeacher(){
        Teacher teacher = Teacher.builder().teacherName("徐老师").clazzId(1).build();
    }
}