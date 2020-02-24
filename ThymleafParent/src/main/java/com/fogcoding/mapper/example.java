package com.fogcoding.mapper;

import com.fogcoding.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface example {

    User selectAll();

}
