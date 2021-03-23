package xyz.zfdu.boot.jdbc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import xyz.zfdu.boot.jdbc.entity.Student;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Repository
public class StudentDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Student save(Student student) {
        String sql = "INSERT INTO student (name,githubName,nickname,hometown,birthday,constellation,mobile,qq,email,avatar,github,hobby,signature,color) VALUES  (?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        Object[] args = {student.getName(),student.getGithubName(),student.getNickname(),student.getHometown(),student.getBirthday(),student.getConstellation(),student.getMobile(),student.getQq(), student.getEmail(),student.getAvatar(),student.getGithub(),student.getHobby(),student.getSignature(),student.getColor()};
        int count = jdbcTemplate.update(sql, args);
        if (count == 1) {
            return student;
        } else {
            return null;
        }
    }

    public int deletedById(Integer id) {
        return jdbcTemplate.update("DELETE FROM student WHERE id = ? ",id);

    }

    public int update(Student student) {
        String sql = "UPDATE student SET  githubName= ?,  nickname= ? , avatar = ?, signature = ? WHERE id = ? ";
        Object[] orgs={student.getGithubName(), student.getNickname(), student.getAvatar(), student.getSignature(), student.getId()};
        return jdbcTemplate.update(sql,orgs);
    }

    public Student findById(Integer id){
        List<Student> students = jdbcTemplate.query("SELECT * FROM student WHERE id = ? ",
                new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
        return students.get(0);
    }

    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM student  ", new BeanPropertyRowMapper<>(Student.class));
    }
}
