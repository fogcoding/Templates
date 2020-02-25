package com.fogcoding.mapper;

import com.fogcoding.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface Test {

    User All1(@Param("_id") int _id);



}
