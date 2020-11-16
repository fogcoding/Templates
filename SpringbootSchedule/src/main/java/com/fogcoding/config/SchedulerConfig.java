//package com.fogcoding.config;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.Trigger;
//import org.springframework.scheduling.TriggerContext;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.config.CronTask;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//import org.springframework.scheduling.support.CronTrigger;
//
//import java.time.LocalDateTime;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.Executors;
//
//@Configuration // 定时调度的配置类一定要实现指定的父接口
//public class SchedulerConfig implements SchedulingConfigurer {
//
//	@Mapper
//	public interface  CronMapper{
//		@Select("select cron from cron")
//		public List<String> getCron();
//	}
//
//	@Autowired
//	private CronMapper cronMapper;
//
////	@Override
////	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) { // 开启一个线程调度池
////		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(100));
////		List<String> crons = cronMapper.getCron();
////		for (String cron:crons) {
////			taskRegistrar.addTriggerTask(new Runnable() {
////				public void run() {
////					System.out.println("数据库定时任务开启:" + LocalDateTime.now() +": " + cron);
////					System.out.println("数据库定时任务开启:" + LocalDateTime.now() +": " + cron);
////
//////					List<CronTask> tasks = taskRegistrar.getCronTaskList();
//////					for (CronTask task:tasks){
//////						System.out.println( "正在执行的定时任务:" + task.getExpression());
//////					}
////
////				}
////			}, new Trigger() {
////				public Date nextExecutionTime(TriggerContext triggerContext) {
////					return new CronTrigger(cron).nextExecutionTime(triggerContext);
////				}
////			});
////		}
//////
////		System.out.println("这个注册方法执行了一遍！");
////
////	}
//
//}
