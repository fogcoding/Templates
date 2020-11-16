package com.fogcoding.mybatis.dao;

import com.fogcoding.mybatis.model.test_env;
import com.fogcoding.mybatis.model.test_envExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface test_envMapper {
    long countByExample(test_envExample example);

    int deleteByExample(test_envExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(test_env record);

    int insertSelective(test_env record);

    List<test_env> selectByExampleWithRowbounds(test_envExample example, RowBounds rowBounds);

    List<test_env> selectByExample(test_envExample example);

    test_env selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") test_env record, @Param("example") test_envExample example);

    int updateByExample(@Param("record") test_env record, @Param("example") test_envExample example);

    int updateByPrimaryKeySelective(test_env record);

    int updateByPrimaryKey(test_env record);
}