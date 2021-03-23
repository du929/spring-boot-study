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
public class Course {
    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 课程名称
     */
    private String courseName;
}