package xyz.zfdu.boot.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zfdu
 * @description ${description}
 * @data 2021-03-23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudent {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 学生id
     */
    private Integer studentId;
}