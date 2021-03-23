package xyz.zfdu.boot.mybatis.mapper;

import xyz.zfdu.boot.mybatis.domain.CourseStudent;

/**
 * @author zfdu
 * @description ${description}
 * @data 2021-03-23
 */
public interface CourseStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseStudent record);

    int insertSelective(CourseStudent record);

    CourseStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseStudent record);

    int updateByPrimaryKey(CourseStudent record);
}