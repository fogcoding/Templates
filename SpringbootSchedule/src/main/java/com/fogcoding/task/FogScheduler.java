package com.fogcoding.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
public class FogScheduler {

	@Scheduled(fixedRate = 2000) // 采用间隔调度，每2秒执行一次
	public void runJobA() { // 定义一个要执行的任务
		System.out.println("【*** MyTaskA - 间隔调度 ***】"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
						.format(new Date()));
	}

	/**
	 * Cron表达式参数分别表示：
	 *
	 * 秒（0~59） 例如0/5表示每5秒
	 * 分（0~59）
	 * 时（0~23）
	 * 日（0~31）的某天，需计算
	 * 月（0~11）
	 * 周几（ 可填1-7 或 SUN/MON/TUE/WED/THU/FRI/SAT）
	 * @Scheduled：除了支持灵活的参数表达式cron之外，还支持简单的延时操作，例如 fixedDelay ，fixedRate 填写相应的毫秒数即可
	 *
	 * 使用@Scheduled 注解很方便，但缺点是当我们调整了执行周期的时候，需要重启应用才能生效，这多少有些不方便。
	 * 为了达到实时生效的效果，可以使用接口来完成定时任务
	 */
	@Scheduled(cron = "0/3 * * * * ?") // 每秒调用一次
	public void runJobB() {
		System.err.println("【*** MyTaskB - 间隔调度 ***】"
				+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
						.format(new Date()));
	}


}
