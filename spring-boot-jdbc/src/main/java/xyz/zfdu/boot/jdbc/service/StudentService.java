package xyz.zfdu.boot.jdbc.service;

import xyz.zfdu.boot.jdbc.entity.Student;

import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
public interface StudentService {
    /**
     * 增加学生
     *
     * @param  student
     * @return boolean
     */
    boolean postStudent(Student student);
    /**
     * 根据id删除学生
     *
     * @param  id id
     * @return boolean
     */
    boolean deleteStudent(int id);
    /**
     * 更新学生
     *
     * @param  student student
     * @return boolean
     */
    int updateStudent(Student student);
    /**
     * 根据id查询学生
     * @param  id id
     * @return list
     */
    Student getById(int id);
    /**
     * 查询学生
     * @return boolean
     */
    List<Student> getAll();
}
