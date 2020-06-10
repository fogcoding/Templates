package com.fogcoding.mapper;

import com.fogcoding.model.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/6/10 10:22
 * @e-mail: thinfog@126.com
 */
@Mapper
public interface EmployeesMapper {

    @Select("SELECT * FROM employees limit 1000")
    @Results({
            @Result(property = "emp_no",  column = "emp_no",javaType = String.class),
            @Result(property = "birth_date",  column = "birth_date",javaType = String.class),
            @Result(property = "first_name",  column = "first_name",javaType = String.class),
            @Result(property = "last_name", column = "last_name",javaType = String.class),
            @Result(property = "gender", column = "gender",javaType = String.class),
            @Result(property = "hire_date", column = "hire_date",javaType = String.class)
    })
    List<Employees> getAll();


}
