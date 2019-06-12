package com.itstyle.quartz;

import org.quartz.SchedulerException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 启动类
 * 创建者 科帮网
 * 创建时间	2018年3月28日
 * API接口测试：http://localhost:8080/quartz/swagger-ui.html
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException, SchedulerException {
		SpringApplication.run(Application.class, args);
	}
}