package xyz.zfdu.boot.mybatis.mapper;

import xyz.zfdu.boot.mybatis.domain.Course;

/**
 * @author zfdu
 * @description ${description}
 * @data 2021-03-23
 */
public interface CourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}