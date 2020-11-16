package com.fogcoding.mybatis.dao;

import com.fogcoding.mybatis.model.batch;
import com.fogcoding.mybatis.model.batchExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface batchMapper {
    long countByExample(batchExample example);

    int deleteByExample(batchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(batch record);

    int insertSelective(batch record);

    List<batch> selectByExampleWithRowbounds(batchExample example, RowBounds rowBounds);

    List<batch> selectByExample(batchExample example);

    batch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") batch record, @Param("example") batchExample example);

    int updateByExample(@Param("record") batch record, @Param("example") batchExample example);

    int updateByPrimaryKeySelective(batch record);

    int updateByPrimaryKey(batch record);
}