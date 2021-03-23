package xyz.zfdu.boot.mybatis.mapper;

import org.apache.ibatis.annotations.Select;
import xyz.zfdu.boot.mybatis.domain.Teacher;

import java.util.List;

/**
 * @author zfdu
 * @description ${description}
 * @data 2021-03-23
 */
public interface TeacherMapper {
    /**
     * 返回所有的teacher
     *
     * @return List<Teacher>
     */
    @Select("SELECT * FROM t_teacher")
    List<Teacher> selectAll();

    /**
     *返回所有的Teacher,用xml实现
     *
     * @return  List<Teacher>
     */
    List<Teacher> findAll();

    void insertTeacher(Teacher teacher);
}