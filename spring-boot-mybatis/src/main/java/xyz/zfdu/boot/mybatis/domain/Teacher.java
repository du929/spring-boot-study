package xyz.zfdu.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DuZeFeng
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 教师姓名
     */
    private String teacherName;

    /**
     * 教师管理的班级id
     */
    private Integer clazzId;
}

