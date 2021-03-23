package xyz.zfdu.boot.mybatis.mapper;

import xyz.zfdu.boot.mybatis.domain.Clazz;

/**
 * @author zfdu
 * @description ${description}
 * @data 2021-03-23
 */
public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzId);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}