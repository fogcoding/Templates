package com.fogcoding.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/9/20 20:39
 * @e-mail: thinfog@126.com
 */
@Component
public class SampleJob extends QuartzJobBean {

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("示例任务执行");
    }



}
