package com.fogcoding;

import com.fogcoding.mybatis.dao.batchMapper;
import com.fogcoding.mybatis.model.batch;
import com.fogcoding.mybatis.model.batchExample;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/11/13 16:12
 * @e-mail: thinfog@126.com
 */
@Service
public class mybatisService {

//    batchExample batch = new batchExample();
    @Autowired
    batchMapper batch;

    public void m1(){
        batchExample batchExample = new batchExample();
        batchExample.setOrderByClause("_id limit 50");
        batchExample.createCriteria();
        System.out.println(batch);;
        System.out.println(batch.selectByExample(batchExample));;

        System.out.println(batch.selectByPrimaryKey(1));;
    }

}
