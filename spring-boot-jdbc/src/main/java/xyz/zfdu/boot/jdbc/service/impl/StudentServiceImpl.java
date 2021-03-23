package xyz.zfdu.boot.jdbc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.zfdu.boot.jdbc.dao.StudentDao;
import xyz.zfdu.boot.jdbc.entity.Student;
import xyz.zfdu.boot.jdbc.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDAO;

    @Override
    public boolean postStudent(Student student) {
        Student saveStudent = studentDAO.save(student);
        return saveStudent != null;
    }

    @Override
    public boolean deleteStudent(int id) {
        int row = studentDAO.deletedById(id);
        return row != 0;
    }

    @Override
    public int  updateStudent(Student student) {
        return studentDAO.update(student);
    }

    @Override
    public Student getById(int id) {
        Student student = studentDAO.findById(id);
        return student;
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.findAll();
    }
}
