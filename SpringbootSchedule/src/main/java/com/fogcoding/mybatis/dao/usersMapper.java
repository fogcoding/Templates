package com.fogcoding.mybatis.dao;

import com.fogcoding.mybatis.model.users;
import com.fogcoding.mybatis.model.usersExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface usersMapper {
    long countByExample(usersExample example);

    int deleteByExample(usersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(users record);

    int insertSelective(users record);

    List<users> selectByExampleWithRowbounds(usersExample example, RowBounds rowBounds);

    List<users> selectByExample(usersExample example);

    users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") users record, @Param("example") usersExample example);

    int updateByExample(@Param("record") users record, @Param("example") usersExample example);

    int updateByPrimaryKeySelective(users record);

    int updateByPrimaryKey(users record);
}