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
public class Clazz {
    /**
     * 班级id
     */
    private Integer clazzId;

    /**
     * 班级名称
     */
    private String clazzName;

    /**
     * 班级管理老师的id
     */
    private Integer teacherId;
}